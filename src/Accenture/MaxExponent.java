package Accenture;
import java.util.*;

public class MaxExponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("The number with the maximum exponent of 2 is: " + MaxExponents(a, b));
    }

    // Function to count the exponents of 2 for a given number
    private static int countExponentsOf2(int num) {
        int count = 0;

        // Keep dividing the number by 2 as long as it is divisible
        while (num % 2 == 0) {
            num = num / 2;
            count++;
        }
        return count;  // Return the exponent count
    }

    // Function to find the number with the maximum exponent of 2
    public static int MaxExponents(int a, int b) {
        int maxNum = a;  // Initialize with the first number in the range
        int maxExponent = countExponentsOf2(a); // Get the exponent of 2 for 'a'

        // Loop from 'a' to 'b'
        for (int i = a + 1; i <= b; i++) {
            int currentExponent = countExponentsOf2(i);  // Count exponents for the current number

            // If the current number has more exponents of 2, update maxNum
            if (currentExponent > maxExponent) {
                maxExponent = currentExponent;
                maxNum = i;
            }
        }

        return maxNum;  // Return the number with maximum exponents of 2
    }
}
