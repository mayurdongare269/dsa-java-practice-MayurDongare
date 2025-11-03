import java.util.*;

public class _1578_Minimum_Time_to_Make_Rope_Colorful {
    public static void main(String[] args) {
        Solution sol = new Solution();

        String colors = "abaac";
        int[] neededTime = {1, 2, 3, 4, 5};

        int result = sol.minCost(colors, neededTime);
        System.out.println("Minimum time to make rope colorful = " + result);
    }
}

class Solution {
    public int minCost(String colors, int[] neededTime) {
        int totTime = 0;
        int n = colors.length();

        for(int i = 1; i < n; i++) {
            if(colors.charAt(i) == colors.charAt(i - 1)) {
                // to return min time
                totTime += Math.min(neededTime[i], neededTime[i - 1]);

                // to remove prev small val and keep big one for next comparisions
                neededTime[i] = Math.max(neededTime[i], neededTime[i-1]);
            }
        }

        return totTime;


    }
}