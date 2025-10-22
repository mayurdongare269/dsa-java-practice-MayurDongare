// public class _1288_Remove_Covered_Intervals {
    
// }
import java.util.*;

class _1288_Remove_Covered_Intervals {
    public int removeCoveredIntervals(int[][] intervals) {
        // Sort by start ascending, end descending
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] == b[0]) return b[1] - a[1];
            return a[0] - b[0];
        });

        int count = 0;
        int prevEnd = 0;

        for (int i = 0; i < intervals.length; i++) {
            int end = intervals[i][1];

            // If current interval goes beyond prevEnd -> it's not covered
            if (i == 0 || end > prevEnd) {
                count++;
                prevEnd = end;
            }
            // else it's covered -> do nothing
        }

        return count;
    }

    public static void main(String[] args) {
        _1288_Remove_Covered_Intervals sol = new _1288_Remove_Covered_Intervals();
        int[][] intervals = {{1,4}, {3,6}, {2,8}};
        System.out.println(sol.removeCoveredIntervals(intervals)); // ✅ Output: 2
    }
}
