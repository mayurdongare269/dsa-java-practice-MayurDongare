import java.util.*;

public class GFG_All_divisors_of_a_Number {
    public static void main(String[] args) {
        Solution.print_divisors(20);
    }
}

class Solution {
    public static void print_divisors(int n) {
        java.util.List<Integer> small = new java.util.ArrayList<>();
        java.util.List<Integer> large = new java.util.ArrayList<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                small.add(i);
                if (i != n / i) {
                    large.add(n / i);
                }
            }
        }

        // Print smaller divisors first
        for (int num : small) System.out.print(num + " ");
        // Then print larger divisors in reverse order
        for (int i = large.size() - 1; i >= 0; i--) {
            System.out.print(large.get(i) + " ");
        }
    }
}
