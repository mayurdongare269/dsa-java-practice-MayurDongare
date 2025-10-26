// public class _Q1_Lexicographically_Smallest_String_After_Reverse {
    
// }

import java.util.*;

public class _Q1_Lexicographically_Smallest_String_After_Reverse {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s1 = "cab";
        String s2 = "dcba";

        System.out.println("Lexicographically smallest for " + s1 + " : " + solution.lexSmallest(s1));
        System.out.println("Lexicographically smallest for " + s2 + " : " + solution.lexSmallest(s2));
    }
}

class Solution {
    public String lexSmallest(String s) {
        int n = s.length();
        String smallest = s; // start with original string

        for (int k = 1; k <= n; k++) {
            // Reverse first k characters (prefix)
            String firstRev = new StringBuilder(s.substring(0, k)).reverse().toString() + s.substring(k);
            
            // Reverse last k characters (suffix)
            String lastRev = s.substring(0, n - k) + new StringBuilder(s.substring(n - k)).reverse().toString();

            // Keep the lexicographically smallest string
            if (firstRev.compareTo(smallest) < 0) {
                smallest = firstRev;
            }
            if (lastRev.compareTo(smallest) < 0) {
                smallest = lastRev;
            }
        }

        return smallest;
    }
}
