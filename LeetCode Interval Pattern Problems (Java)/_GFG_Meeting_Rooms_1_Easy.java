// _GFG_Meeting Rooms_1_Easy.java -

import java.util.*; // O(nlogn) & O(logn)

public class _GFG_Meeting_Rooms_1_Easy {
    static boolean canAttend(int[][] arr) {
        // Step 1: Sort by start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Compare consecutive meetings
        for (int i = 1; i < arr.length; i++) {
            // If the next meeting starts before the previous one ends → conflict
            if (arr[i][0] < arr[i - 1][1]) {
                return false;
            }
        }

        return true; // No overlaps found
    }

    public static void main(String[] args) {
        int[][] meetings1 = {{1, 4}, {10, 15}, {5, 7}};
        int[][] meetings2 = {{1, 4}, {2, 3}, {3, 5}};

        System.out.println(canAttend(meetings1)); // ✅ true
        System.out.println(canAttend(meetings2)); // ❌ false
    }
}
