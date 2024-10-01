package Accenture;

import java.util.Scanner;

public class ValidHours {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(valid(arr, n));

    }

    static int valid(int[] arr, int n){
        n = arr.length;
        int count = 0;

        if(n==1) return -1;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == 60){
                    count+= 1;
                }
                if(arr[i] == 60){
                    count += 1;
                }
            }
        }
        return count;
    }
}
