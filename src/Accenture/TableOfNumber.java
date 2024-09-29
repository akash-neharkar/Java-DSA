package Accenture;

import java.util.Scanner;

public class TableOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int a = in.nextInt();

        System.out.println("Sum = " + tablesum(a));
    }

    public static int tablesum(int a){

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(a*i + " ");
            sum += a*i;
        }
        System.out.println();
        return sum;
    }
}
