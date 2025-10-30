// remember...
// Approach (Euclidean Algorithm)

// The Euclidean Algorithm says:

// GCD(a, b) = GCD(b, a % b)
// and when b == 0, GCD = a

// It’s fast — runs in O(log(min(a, b))) time.



import java.util.*;

public class GFG_GCD_of_two_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        Solution sol = new Solution();
        System.out.println("GCD of " + a + " and " + b + " is: " + sol.gcd(a, b));

        sc.close();
    }
}

class Solution {
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

