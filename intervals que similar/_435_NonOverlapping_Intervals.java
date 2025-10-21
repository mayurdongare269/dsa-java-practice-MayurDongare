import java.util.*; 
// similar to leetcode 452

public class _435_NonOverlapping_Intervals {
    public static int eraseOverlapIntervals(int[][] intervals) {
        // Step 1: Sort intervals by end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0; // Count of intervals to remove
        int prevEnd = intervals[0][1]; // End time of last non-overlapping interval

        // Step 2: Iterate through intervals
        for (int i = 1; i < intervals.length; i++) {
            // Overlap -> remove this interval
            if (intervals[i][0] < prevEnd) {
                count++;
            } else {
                // No overlap -> update previous end
                prevEnd = intervals[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();

        int[][] intervals = new int[n][2];
        System.out.println("Enter each interval as: start end");

        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }

        int result = eraseOverlapIntervals(intervals);

        System.out.println("Minimum intervals to remove: " + result);

        sc.close();
    }
}
