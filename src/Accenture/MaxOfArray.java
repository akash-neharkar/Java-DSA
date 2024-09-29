package Accenture;
import java.util.*;

public class MaxOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the arrar: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        maxInArray(arr, n);
    }

    public static void maxInArray (int arr[], int length)
    {
        int max = arr[0], index = 0;
        for (int i = 1; i < length; i++)
            if (arr[i] > max)
            {
                max = arr[i];
                index = i;
            }
        System.out.println (max);
        System.out.println (index);
    }

}
