public class _1015_Smallest_Integer_Divisible_By_K {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.smallestRepunitDivByK(3)); // output: 3
    }
}

class Solution {
    public int smallestRepunitDivByK(int k) {
        // if divisible by 2 or 5 → no such number possible
        if (k % 2 == 0 || k % 5 == 0) return -1;

        int rem = 0;

        for (int len = 1; len <= k; len++) {
            rem = (rem * 10 + 1) % k;

            if (rem == 0) return len;
        }

        return -1;
    }
}
