import java.util.*;

public class _1_704_Binary_Search {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 3, 5, 7, 9, 11};
        int target = 7;

        int result = s.search(nums, target);
        System.out.println("Index of " + target + " → " + result);
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
