public class _3228_Maximum_Operations_Move_Ones {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.maxOperations("1001101")); // 4
        System.out.println(sol.maxOperations("00111"));   // 0
        System.out.println(sol.maxOperations("1010"));    // 3
        System.out.println(sol.maxOperations("11000"));   // 2
    }
}

class Solution {
    public int maxOperations(String s) {
        int ans = 0;
        int ones = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '1') {
                ones++;
            }
            else if (i == s.length() - 1 || s.charAt(i + 1) == '1') {
                // last zero of a block
                ans += ones;
            }
        }

        return ans;
    }
}
