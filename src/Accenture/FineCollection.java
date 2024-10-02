package Accenture;

import java.util.Scanner;

public class FineCollection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the vehicle numbers: ");
        int[] number = new int[n];
        for (int i = 0; i < n; i++) {
            number[i] = in.nextInt();
        }
        System.out.println("Enter the fines: ");
        int[] fines = new int[n];
        for (int i = 0; i < n; i++) {
            fines[i] = in.nextInt();
        }

        System.out.println(fine(number, fines));

    }


    public static int fine(int[] number, int[] fines){
        int n = number.length;
        int cost = 0;

        for (int i = 0; i < n; i++) {
                if(number[i] % 2 == 0){
                    cost += fines[i] * 10;
                }
                else{
                    cost += fines[i] * 15;
                }
        }
        return cost;
    }

}
