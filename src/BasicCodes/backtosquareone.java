package BasicCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class backtosquareone {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);

        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Enter the number you want to find: ");
        int n = in.nextInt();

        int res = findnumber(arr, n);
        System.out.println(res);

    }

    public static int findnumber(int[] arr, int n){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
