public class _1134_Armstrong_Number {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 153;
        int n2 = 123;

        System.out.println(n1 + " → " + sol.isArmstrong(n1)); // true
        System.out.println(n2 + " → " + sol.isArmstrong(n2)); // false
    }
}

class Solution {
    public boolean isArmstrong(int n) {
        String s = String.valueOf(n);
        int k = s.length();
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, k);
            temp /= 10;
        }

        return sum == n;
    }
}
