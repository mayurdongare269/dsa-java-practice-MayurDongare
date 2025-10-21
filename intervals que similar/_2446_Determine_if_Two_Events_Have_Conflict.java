// _2446_Determine_if_Two_Events_Have_Conflict


class _2446_Determine_if_Two_Events_Have_Conflict {
    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        return hours*60 + min;
    }

    public boolean haveConflict(String[] event1, String[] event2) {
        int s1 = convertToMinutes(event1[0]); // s1 = start1
        int e1 = convertToMinutes(event1[1]);
        int s2 = convertToMinutes(event2[0]);
        int e2 = convertToMinutes(event2[1]);

        return s1 <= e2 && s2 <= e1;
    }

    public static void main(String[] args) {
        _2446_Determine_if_Two_Events_Have_Conflict sol = new _2446_Determine_if_Two_Events_Have_Conflict();
        
        String[] event1 = {"01:15","02:00"};
        String[] event2 = {"02:00","03:00"};
        System.out.println(sol.haveConflict(event1, event2)); // true
        
        String[] event3 = {"10:00","11:00"};
        String[] event4 = {"14:00","15:00"};
        System.out.println(sol.haveConflict(event3, event4)); // false
    }
}