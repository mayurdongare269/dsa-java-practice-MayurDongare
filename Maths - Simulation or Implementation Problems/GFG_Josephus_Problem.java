import java.util.*;

public class GFG_Josephus_Problem {
    public static int helper(int n, int k) {
        if (n == 1) return 0;
        return (helper(n - 1, k) + k) % n;
    }

    public static int josephus(int n, int k) {
        return helper(n, k) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(josephus(n, k));
        sc.close();
    }
}
