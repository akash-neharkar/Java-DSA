package Accenture;

import java.util.Scanner;

public class FindDividend {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the Divisor D: ");
        int D = in.nextInt();
        System.out.println("Enter the Quotient Q: ");
        int Q = in.nextInt();
        System.out.println("Enter the Remainder R: ");
        int R = in.nextInt();

        System.out.println(dividend(arr, D, Q, R));
    }

    static int dividend (int[] arr, int D, int Q, int R){

        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i] == D*Q+R){
                return i;
            }
        }
        return -1;
    }
}
