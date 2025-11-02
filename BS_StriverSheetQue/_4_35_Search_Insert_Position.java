import java.util.*;

public class _4_35_Search_Insert_Position {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {1, 3, 4, 6};

        System.out.println(sol.searchInsert(nums, 5)); // Output: 3
        System.out.println(sol.searchInsert(nums, 2)); // Output: 1
    }
    
}


class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high) {
            int mid = low + (high - low) / 2;

            if(nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}

