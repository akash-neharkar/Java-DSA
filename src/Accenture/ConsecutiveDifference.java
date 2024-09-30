package Accenture;
import java.util.*;

public class ConsecutiveDifference {
    // Function to find the max subarray where consecutive elements differ by k
    public static int findMaxSubArray(int[] arr, int n, int k) {
        int maxLen = 1;  // Length of the maximum subarray found
        int currentLen = 1;  // Length of the current subarray

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // Check if the difference between consecutive elements is equal to k
            if (arr[i] - arr[i - 1] == k) {
                currentLen++;  // Increase the length of the current subarray
            } else {
                // Update the maximum length and reset the current subarray length
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;  // Reset current subarray length
            }
        }

        // Final check to compare the last subarray length
        maxLen = Math.max(maxLen, currentLen);

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Input the array elements
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Input the value of k
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Find and print the maximum subarray length
        int maxSubArrayLength = findMaxSubArray(arr, n, k);
        System.out.println("The length of the maximum subarray where difference between consecutive elements is " + k + " is: " + maxSubArrayLength);
    }
}
