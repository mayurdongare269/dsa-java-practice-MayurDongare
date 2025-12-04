import java.util.*;

public class _2211_Count_Collisions_on_a_Road {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int res = sol.countCollisions("RRSSLL");
        System.out.println(res);
    }
}

class Solution { // done >>>>
    public int countCollisions(String directions) {
        int n = directions.length();
        int left = 0, right = n - 1;

        // Ignore all starting L cars bz they never colalide
        while (left < n && directions.charAt(left) == 'L') {
            left++;
        }

        // Ignore all ending R cars
        while (right >= 0 && directions.charAt(right) == 'R') {
            right--;
        }

        int collisions = 0;
        // Count all moving cars (L or R) in the middle region
        for (int i = left; i <= right; i++) {
            char c = directions.charAt(i);
            if (c == 'L' || c == 'R') { // c != 'S'
                collisions++;
            }
        }

        return collisions;
    }
}
