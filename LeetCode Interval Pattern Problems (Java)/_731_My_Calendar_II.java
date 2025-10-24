// public class _731_My_Calendar_II {
    
// }

import java.util.*;

public class _731_My_Calendar_II {

    public static void main(String[] args) {
        MyCalendarTwo cal_2 = new MyCalendarTwo();

        System.out.println(cal_2.book(10, 20));
    }
}


class MyCalendarTwo {
    List<int[]> bookings;
    List<int[]> overlaps;

    public MyCalendarTwo() {
        bookings = new ArrayList<>();
        overlaps = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        // List<int[]> count = new ArrayList<>();

        for(int[] interval : overlaps) {
            int s1 = interval[0];
            int e1 = interval[1];
            int s2 = startTime;
            int e2 = endTime;

            if(s1 < e2 && s2 < e1) { // overlap and 
                return false;
            }
        }

        for(int[] interval : bookings) { //Add overlapping parts to 'overlaps' list
            int s1 = interval[0];
            int e1 = interval[1];
            int s2 = startTime;
            int e2 = endTime;

            if(s1 < e2 && s2 < e1) { // overlap and 
                overlaps.add(new int[] {
                    Math.max(s1, s2),
                    Math.min(e1, e2)
                });
            }
        }



        //  count++;
        bookings.add(new int[]{startTime, endTime});
        return true;

    }
}

