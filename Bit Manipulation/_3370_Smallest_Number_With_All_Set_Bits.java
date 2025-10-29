public class _3370_Smallest_Number_With_All_Set_Bits {

    static class Solution {
        public int smallestNumber(int n) {
            int x = 1;
            while (x < n) {
                x = (x << 1) | 1; // shift left and set next bit
            }
            return x;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 5;
        int n2 = 10;
        int n3 = 31;
        int n4 = 33;

        System.out.println("Input: " + n1 + " → Output: " + sol.smallestNumber(n1));
        System.out.println("Input: " + n2 + " → Output: " + sol.smallestNumber(n2));
        System.out.println("Input: " + n3 + " → Output: " + sol.smallestNumber(n3));
        System.out.println("Input: " + n4 + " → Output: " + sol.smallestNumber(n4));
    }
}
