package Accenture;
import java.util.*;

public class ProductSmallestPair {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the value of sum: ");
        int sum = in.nextInt();

        System.out.println(SmallestPairProduct(arr, n, sum));

    }

    public static int SmallestPairProduct (int[] arr, int n, int sum) {

        if (n <2) return -1;

        int ans, temp, check;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        check = arr[0] + arr[1];
        if (check <= sum)
            return arr[0] * arr[1];
        else
            return 0;

    }
}
