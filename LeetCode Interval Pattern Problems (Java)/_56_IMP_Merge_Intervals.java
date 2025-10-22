// _56_IMP_Merge_Intervals.java -> most imp que and also inssert interval 57

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _56_IMP_Merge_Intervals {

    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        // 1. sort by beginning
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // 2. list to store merged intervals
        List<int[]> merged = new ArrayList<>();

        // 3. merge intervals
        for(int[] interval : intervals) {
            // case1: non-overlapping
            if(merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else { // case2: overlapping -> merge
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], 
                interval[1]);
            }
        }

        // 4. convert list to array
        return merged.toArray(new int[merged.size()][]);
    }

    // Helper function to print 2D array
    public void printIntervals(int[][] intervals) {
        for(int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public static void main(String[] args) {
        _56_IMP_Merge_Intervals sol = new _56_IMP_Merge_Intervals();

        // Example 1
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println("Merged Intervals Example 1:");
        int[][] merged1 = sol.merge(intervals1);
        sol.printIntervals(merged1);

        // Example 2
        int[][] intervals2 = {{1,4},{4,5}};
        System.out.println("\nMerged Intervals Example 2:");
        int[][] merged2 = sol.merge(intervals2);
        sol.printIntervals(merged2);
    }
}
