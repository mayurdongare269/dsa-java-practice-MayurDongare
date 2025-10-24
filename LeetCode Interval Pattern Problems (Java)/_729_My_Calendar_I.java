// public class _729_My_Calendar_I {
    
// }

import java.util.*;

public class _729_My_Calendar_I {

    public static void main(String[] args) {
        MyCalendar cal = new MyCalendar();

        System.out.println(cal.book(10, 20));
    }
}


class MyCalendar {
    List<int[]> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] interval : bookings) {
            int s1 = interval[0];
            int e1 = interval[1];
            int s2 = startTime;
            int e2 = endTime;

            if(s1 < e2 && s2 < e1) { // overlap condition
                return false;
            }
        }

        // no overlap 
        bookings.add(new int[]{startTime, endTime});
        return true;
    }
}
