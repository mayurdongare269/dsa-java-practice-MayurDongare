import java.util.*;

public class _75_Sort_Colors {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {2, 0, 2, 1, 1, 0};
        sol.sortColors(nums);
        System.out.println(Arrays.toString(nums)); // [0, 0, 1, 1, 2, 2]
    }
}

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, m = 0, h = n - 1;

        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, m, l);
                m++;
                l++;
            } else if (nums[m] == 2) {
                swap(nums, m, h);
                h--;
                // DO NOT increment m here, because the swapped element from h might need recheck
            } else {
                m++;
            }
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
