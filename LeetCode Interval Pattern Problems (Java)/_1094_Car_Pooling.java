// public class _1094_Car_Pooling {
    
// } 

// not a perfect interval ps


import java.util.*;

public class _1094_Car_Pooling {

    public static boolean carPooling(int[][] trips, int capacity) {
        int[] changes = new int[1001]; 

        // S1.
        for (int[] trip : trips) {
            int num = trip[0], from = trip[1], to = trip[2];
            changes[from] += num;
            changes[to] -= num;
        }

        // S2.
        int currPassengers = 0;
        for (int i = 0; i <= 1000; i++) {
            currPassengers += changes[i];
            if (currPassengers > capacity) {
                return false;
            }
        }
        return true;
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of trips: ");
        int n = sc.nextInt();

        int[][] trips = new int[n][3];
        System.out.println("Enter trips in format [numPassengers from to]:");
        for (int i = 0; i < n; i++) {
            trips[i][0] = sc.nextInt(); 
            trips[i][1] = sc.nextInt(); 
            trips[i][2] = sc.nextInt(); 
        }

        System.out.print("Enter car capacity: ");
        int capacity = sc.nextInt();

        boolean result = carPooling(trips, capacity);
        System.out.println("Can all passengers be accommodated? " + result);

        sc.close();
    }
}
