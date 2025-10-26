import java.util.*;

public class _283_Move_Zeroes {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        sol.moveZeroes(nums1);
        System.out.print("Output 1: ");
        printArray(nums1);  // Expected: [1, 3, 12, 0, 0]

        int[] nums2 = {0, 0, 1};
        sol.moveZeroes(nums2);
        System.out.print("Output 2: ");
        printArray(nums2);  // Expected: [1, 0, 0]
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;  // Pointer for next non-zero placement

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
