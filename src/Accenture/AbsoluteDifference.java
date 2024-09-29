package Accenture;
import java.util.*;

public class AbsoluteDifference {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));

        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        System.out.println("Enter the difference: ");
        int diff = in.nextInt();

        System.out.println(find(arr, n, num, diff));

    }

    static int find(int[] arr, int length, int num, int diff){

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(Math.abs(arr[i] - num) <= diff){
                count+=1;
            }
        }
        return count > 0 ? count : -1;
    }
}
