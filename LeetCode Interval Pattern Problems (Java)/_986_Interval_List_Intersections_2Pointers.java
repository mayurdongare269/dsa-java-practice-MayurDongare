// 986. Interval List Intersections -> two pointer que


import java.util.*;

public class _986_Interval_List_Intersections_2Pointers {

    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;
        int n = firstList.length, m = secondList.length;
        
        while (i < n && j < m) {
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            
            // Check for overlap
            if (start <= end) {
                res.add(new int[]{start, end});
            }
            
            // Move pointer with smaller end time
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        
        return res.toArray(new int[res.size()][]); // list to arr
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // i/p for first list
        System.out.print("Enter number of intervals in first list: ");
        int n = sc.nextInt();
        int[][] firstList = new int[n][2];
        System.out.println("Enter intervals for first list (start end):");
        for (int i = 0; i < n; i++) {
            firstList[i][0] = sc.nextInt();
            firstList[i][1] = sc.nextInt();
        }

        // Input for second list
        System.out.print("\nEnter number of intervals in second list: ");
        int m = sc.nextInt();
        int[][] secondList = new int[m][2];
        System.out.println("Enter intervals for second list (start end):");
        for (int i = 0; i < m; i++) {
            secondList[i][0] = sc.nextInt();
            secondList[i][1] = sc.nextInt();
        }

        // Call function
        int[][] result = intervalIntersection(firstList, secondList);

        // Output
        System.out.println("\nIntersection Intervals:");
        for (int[] interval : result) { // print list
            System.out.println(Arrays.toString(interval));
        }

        sc.close();
    }
}
