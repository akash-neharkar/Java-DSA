package Accenture;

import java.util.Scanner;

public class BobCandy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input section
        System.out.println("Enter the number of Candies: ");
        int N = in.nextInt();
        System.out.println("Enter the prices of the Candies: ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the total amount given to Bob: ");
        int M = in.nextInt();

        System.out.println("Candies Bob can buy: " + countCandies(arr, N, M));

    }

    static int countCandies(int[] arr, int N, int M) {
        int count = 0;
        int currAmount = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] % 5 == 0) {
                count++;
            } else if (currAmount + arr[i] <= M) {
                currAmount += arr[i];
                count++;
            }

            if (currAmount == M) {
                return count;
            }
        }
        return count;
    }
}
