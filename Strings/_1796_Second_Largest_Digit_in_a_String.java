// public class _1796_Second_Largest_Digit_in_a_String {
    
// }


public class _1796_Second_Largest_Digit_in_a_String {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String s1 = "dfa12321afd";
        String s2 = "abc1111";
        String s3 = "ck077";

        System.out.println("Input: " + s1 + " → Output: " + sol.secondHighest(s1)); // 2
        System.out.println("Input: " + s2 + " → Output: " + sol.secondHighest(s2)); // -1
        System.out.println("Input: " + s3 + " → Output: " + sol.secondHighest(s3)); // 0
    }
}

class Solution {
    public int secondHighest(String s) {
        int firstMax = -1;
        int secondMax = -1;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int d = ch - '0';
                
                if (d > firstMax) {
                    secondMax = firstMax;
                    firstMax = d;
                } else if (d < firstMax && d > secondMax) {
                    secondMax = d;
                }
            }
        }

        return secondMax;
    }
}
