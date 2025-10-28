// public class _3354_Make_Array_Elements_Equal_to_Zero {
    
// }


import java.util.*;

public class _3354_Make_Array_Elements_Equal_to_Zero {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 0, 2, 0, 3};
        int[] nums2 = {2, 3, 4, 0, 4, 1, 0};

        System.out.println("Output 1: " + sol.countValidSelections(nums1)); // Expected: 2
        System.out.println("Output 2: " + sol.countValidSelections(nums2)); // Expected: 0
    }
}

class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (simulate(nums, i, -1)) count++; // Move left
                if (simulate(nums, i, 1)) count++;  // Move right
            }
        }

        return count;
    }

    private boolean simulate(int[] nums, int start, int dir) {
        int n = nums.length;
        int[] temp = Arrays.copyOf(nums, n); // Copy to avoid modifying original
        int curr = start;

        while (curr >= 0 && curr < n) {
            if (temp[curr] == 0) {
                curr += dir; // Keep moving in same direction
            } else {
                temp[curr]--; // Decrease value by 1
                dir *= -1;    // Reverse direction
                curr += dir;  // Move one step in reversed direction
            }
        }

        // Verify if all elements became zero
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) return false;
        }

        return true;
    }
}
