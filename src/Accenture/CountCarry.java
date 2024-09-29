package Accenture;
import java.util.*;

public class CountCarry {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = in.nextInt();

        System.out.println("Addition: ");
        System.out.println(num1+num2);
        System.out.println("No. of carries = " + numberOfCarries(num1, num2));
    }

    public static int numberOfCarries(int num1, int num2) {
        int count = 0;
        int rem = 0;

        while (num1 != 0 || num2 != 0) {
            int d1 = num1 % 10; // Get the last digit of num1
            int d2 = num2 % 10; // Get the last digit of num2

            // Check if the sum of the digits and the carry generates a new carry
            if ((d1 + d2 + rem) > 9) {
                count++;
                rem = 1; // Carry will be 1 if sum > 9
            } else {
                rem = 0; // No carry if sum <= 9
            }

            // Move to the next digit
            num1 = num1 / 10; // Remove last digit from num1
            num2 = num2 / 10; // Remove last digit from num2
        }

        return count;
    }
}
