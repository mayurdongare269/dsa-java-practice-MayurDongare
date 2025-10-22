import java.util.*; // medium level

class _GFG_Meeting_Rooms_II_med {
    public int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);

        int n = start.length;
        int rooms = 0, maxRooms = 0;
        int sPtr = 0, ePtr = 0;

        while (sPtr < n && ePtr < n) {
            if (start[sPtr] < end[ePtr]) {
                rooms++;  // new meeting starts before one ends
                sPtr++;
            } else {
                rooms--;  // one meeting ended, room freed
                ePtr++;
            }
            maxRooms = Math.max(maxRooms, rooms);
        }

        return maxRooms;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of meetings: ");
        int n = sc.nextInt();

        int[] start = new int[n];
        int[] end = new int[n];

        System.out.println("Enter start times:");
        for (int i = 0; i < n; i++) start[i] = sc.nextInt();

        System.out.println("Enter end times:");
        for (int i = 0; i < n; i++) end[i] = sc.nextInt();

        _GFG_Meeting_Rooms_II_med sol = new _GFG_Meeting_Rooms_II_med();
        System.out.println("Minimum rooms required: " + sol.minMeetingRooms(start, end));
    }
}
