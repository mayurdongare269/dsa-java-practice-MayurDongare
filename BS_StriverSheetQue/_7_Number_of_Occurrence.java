import java.util.*;

public class _7_Number_of_Occurrence {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;

        int count = sol.countFreq(arr, target);
        System.out.println("Number of occurrences of " + target + ": " + count);
    }
}

class Solution {
    int countFreq(int[] arr, int target) {
        int first = findFirst(arr, target);
        if (first == -1) return 0; // target not found
        int last = findLast(arr, target);
        return last - first + 1;
    }

    private int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                high = mid - 1; // search left for first occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }

    private int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                res = mid;
                low = mid + 1; // search right for last occurrence
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return res;
    }
}
