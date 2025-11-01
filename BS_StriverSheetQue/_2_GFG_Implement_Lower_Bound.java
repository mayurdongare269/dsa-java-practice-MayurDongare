import java.util.*;

public class _2_GFG_Implement_Lower_Bound {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] arr = {1, 3, 3, 5, 7, 9};

        System.out.println("Lower Bound of 3 → " + s.lowerBound(arr, 3));
        System.out.println("Lower Bound of 4 → " + s.lowerBound(arr, 4));
    }
}

class Solution {
    int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
