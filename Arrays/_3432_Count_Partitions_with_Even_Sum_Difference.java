import java.util.*;

public class _3432_Count_Partitions_with_Even_Sum_Difference {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int ans = sol.countPartitions(new int[]{1, 2, 3, 4});
        System.out.println(ans);
    }
}

class Solution {// done ,.... two pass solution ...
    public int countPartitions(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        int totSum = 0;
        for(int i = 0; i < n; i++) {
            totSum += nums[i];
        }

        for(int i = 0; i <= n-2; i++) {
            int prev = sumf(nums, 0, i); // leftsum == prev
            int next = totSum - prev; // rightsum == next
            int ans = prev - next;
            if(ans % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int sumf(int[] arr, int s, int e) {
        int sum = 0;
        for(int i = s; i <= e; i++) {
            sum += arr[i];
        }

        return sum;
    }
}
