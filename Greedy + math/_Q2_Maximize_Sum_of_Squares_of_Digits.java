// _Q2_Maximize_Sum_of_Squares_of_Digits.java
import java.util.*;

public class _Q2_Maximize_Sum_of_Squares_of_Digits {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int num = 5;
        int sum = 28;

        String result = solution.maxSumOfSquares(num, sum);
        if(result.isEmpty()) {
            System.out.println("Not possible to form such a number");
        } else {
            System.out.println("Maximum sum of squares number: " + result);
        }
    }
}

class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder res = new StringBuilder();

        if(sum > 9 * num) {
            return "";
        }

        for(int i = 0; i < num; i++) {
            int d = Math.min(sum, 9); // choose largest possible digit
            res.append(d);
            sum -= d;
        }

        if(sum > 0) return "";

        return res.toString();
    }
}
