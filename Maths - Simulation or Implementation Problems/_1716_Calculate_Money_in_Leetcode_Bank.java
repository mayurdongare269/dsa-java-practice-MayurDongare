
import java.util.*;

public class _1716_Calculate_Money_in_Leetcode_Bank {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println(sol.totalMoney(n));
   }  
}

class Solution {
    public int totalMoney(int n) { 
        // Method-1 O(n)
        int weekStart = 1;
        int total = 0;

        while(n > 0) {
            for(int i = 0; i < Math.min(n,7); i++) {
                total += (weekStart + i); // i == day
            }
            weekStart++;
            n-=7;
        }
        return total;

        //Method-2 -> using arithmatic series formula but i think its complecated O(1)





        // int i = 0;
        // int count = 0;
        // int totMoney = 0;
        
        // while(i < n) {
        //     for(int j = 1; j <= 7; j++) {
        //         totMoney++;
        //     }
        //     count++;
        // }
    }
}