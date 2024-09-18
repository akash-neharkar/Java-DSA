package DSA;

public class MaxOfSubArray {
    //Kadane's Algorithm
    public static void main(String[] args) {

        int[] arr = {1, 2, -2, -2, -1};
        System.out.println("Maximum Sum Subarray (arr1): " + findMaxSum(arr));

    }

    public static int findMaxSum(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int currentMax = arr[0];
        int globalMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }


}