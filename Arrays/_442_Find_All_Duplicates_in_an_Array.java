import java.util.*;

public class _442_Find_All_Duplicates_in_an_Array {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(sol.findDuplicates(nums)); // [2, 3]
    }
}

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;

            if (nums[index] < 0) {
                result.add(Math.abs(num));
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }
}
