public class _BW_Q3_Minimum_Operations_to_Transform_Array {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {1, 3, 2};
        int[] nums2 = {2, 3, 4, 2};

        long result = sol.minOperations(nums1, nums2);
        System.out.println("Minimum operations required: " + result);
    }
}

class Solution {

    public long minOperations(int[] nums1, int[] nums2) {

        long minOp = Long.MAX_VALUE;
        int n = nums1.length;
        int m = nums2.length;

        // Sanity check: arrays must be transformable (same size after append)
        if (m != n + 1) {
            System.out.println("Transformation not possible: target array length must be n+1.");
            return -1;
        }

        // Try appending each element of nums1
        for (int j = 0; j < n; j++) {

            // Create a new array and copy elements
            int[] arr = new int[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = nums1[i];
            }

            // Append nums1[j]
            arr[n] = nums1[j];

            // Calculate total operations
            long op = 1; // 1 operation for append
            for (int i = 0; i < arr.length; i++) {
                op += Math.abs(arr[i] - nums2[i]);
            }

            // Take minimum operations
            minOp = Math.min(minOp, op);
        }

        return minOp;
    }
}
