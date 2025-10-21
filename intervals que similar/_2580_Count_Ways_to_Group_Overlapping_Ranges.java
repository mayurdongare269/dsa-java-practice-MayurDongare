//_2580_Count_Ways_to_Group_Overlapping_Ranges.java

import java.util.*;

public class _2580_Count_Ways_to_Group_Overlapping_Ranges {
    public int countWays(int[][] ranges) {
        int MOD = 1_000_000_007;
        if (ranges.length == 0) return 1;

        // 1. sort ranges by start
        Arrays.sort(ranges, (a, b) -> Integer.compare(a[0], b[0]));

        int components = 0;
        long currentEnd = -1;

        for (int[] range : ranges) {
            if (range[0] > currentEnd) {
                // New non-overlapping component
                components++;
                currentEnd = range[1];
            } else {
                // Overlapping -> merge
                currentEnd = Math.max(currentEnd, range[1]);
            }
        }

        // 2. compute 2^components % MOD
        long res = 1;
        for (int i = 0; i < components; i++) {
            res = (res * 2) % MOD;
        }

        return (int) res;
    }

    // For testing
    public static void main(String[] args) {
        _2580_Count_Ways_to_Group_Overlapping_Ranges sol = new _2580_Count_Ways_to_Group_Overlapping_Ranges();
        int[][] ranges1 = {{6,10},{5,15}};
        System.out.println(sol.countWays(ranges1)); // Output: 2

        int[][] ranges2 = {{1,3},{10,20},{2,5},{4,8}};
        System.out.println(sol.countWays(ranges2)); // Output: 4
    }
}

