// _2048_Next_Greater_Numerically_Balanced_Number.java
import java.util.*;

public class _2048_Next_Greater_Numerically_Balanced_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Solution sol = new Solution();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        System.out.println(sol.nextBeautifulNumber(num));
    }
}


class Solution {
    public int nextBeautifulNumber(int n) {
        for(int i = n + 1; i <= 1224444; i++) {
            if(isBalance(i)) {
                return i;
            }
        }

        return -1;
    }

    public boolean isBalance(int x) {
        int[] count = new int[10];

        while(x > 0) {
            count[x % 10]++;
            x /= 10;
        }

        for(int d = 0; d < 10; d++) {
            if(count[d] > 0 && count[d] != d) {
                return false;
            }
        }

        return true;
    }
}