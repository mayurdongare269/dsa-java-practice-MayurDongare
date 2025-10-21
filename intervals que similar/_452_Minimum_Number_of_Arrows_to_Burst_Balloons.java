import java.util.*;
import java.util.Arrays;

// similar to leetcode 435

public class _452_Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static int findMinArrowShots(int[][] points) {
        // Step 1: Sort intervals by end time
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1; // Count of non-overlapping intervals
        int prevEnd = points[0][1]; // End time of last non-overlapping interval

        // Step 2: Iterate through intervals
        for (int i = 1; i < points.length; i++) {
            // Overlap -> update previous end
            if (points[i][0] <= prevEnd) {
                continue;
            } else {
                // No overlap -> increment count and update previous end
                count++;
                prevEnd = points[i][1];
            }
        }

        return count;



        //  // Step 3: Iterate through balloons
        // for (int i = 1; i < points.length; i++) {
        //     // If this balloon starts before arrow position, it gets burst
        //     if (points[i][0] <= arrowPos) {
        //         continue;
        //     }

        //     // Otherwise, we need a new arrow
        //     arrowShot++;
        //     arrowPos = points[i][1];
        // }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of balloons : ");
        int n = sc.nextInt();

        int points[][] = new int[n][2];
        System.out.println("Enter each balloon as: start end");

        for(int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        int result = findMinArrowShots(points);

        System.out.println("Minimum number of arrows required: " + result);

        sc.close();
    }
}