package BasicCodes;
import java.util.*;

public class DecToBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // String to store the binary result
        String binary = "";

        // Loop to calculate binary
        while (decimal > 0) {
            int remainder = decimal % 2;  // Get remainder when dividing by 2
            binary = remainder + binary;  // Prepend remainder to binary string
            decimal = decimal / 2;        // Update the decimal value by dividing it by 2
        }

        System.out.println("Binary representation: " + (binary.isEmpty() ? "0" : binary));

    }
}
