// _57_IMP_Insert_Interval.java -> most imp que and also merge interval 56


import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Add intervals before newInterval (non-overlapping, before it starts)
        while (i < n && intervals[i][1] < newInterval[0]) {
            res.add(intervals[i]);
            i++;
        }

        // Merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval); // merged or new interval added

        // 3. Add remaining intervals after newInterval
        while (i < n) {
            res.add(intervals[i]);
            i++;
        }

        // 4️.Convert List<int[]> → int[][]
        return res.toArray(new int[res.size()][]);
    }
}

public class _57_IMP_Insert_Interval {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example input
        int[][] intervals = { {1, 3}, {6, 9} };
        int[] newInterval = {2, 5};

        int[][] result = sol.insert(intervals, newInterval);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }

        // You can test with more cases:
        int[][] intervals2 = { {1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16} };
        int[] newInterval2 = {4, 8};
        int[][] result2 = sol.insert(intervals2, newInterval2);

        System.out.println("\nAnother Test Case:");
        for (int[] interval : result2) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
