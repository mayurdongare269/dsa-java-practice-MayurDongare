import java.util.*;

public class _70_Climbing_Stairs {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int n1 = 2;
        int n2 = 5;
        int n3 = 10;

        System.out.println("Ways to climb " + n1 + " stairs: " + sol.climbStairs(n1));
        System.out.println("Ways to climb " + n2 + " stairs: " + sol.climbStairs(n2));
        System.out.println("Ways to climb " + n3 + " stairs: " + sol.climbStairs(n3));
    }
}

class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n <= 2) return n;

        int first = 1, second = 2;

        // Iterative DP approach (like Fibonacci)
        for (int i = 3; i <= n; i++) {
            int temp = second;
            second = first + second;
            first = temp;
        }

        return second;
    }
}
