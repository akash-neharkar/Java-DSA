package Accenture;
import java.util.*;

public class RearrangeBinary {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(min(a));
    }

    static String toBinary(int n){
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            int remainder = n % 2;
            binary.insert(0, remainder);  // Append the remainder at the start
            n = n / 2;
        }
        return binary.toString();
    }

    static int toDecimal(String binary) {
        int decimal = 0;
        int base = 1;  // Base is 2^0 initially

        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;  // Add to decimal if bit is 1
            }
            base *= 2;  // Increase the base (2^n)
        }
        return decimal;
    }

    // Function to find the minimum rearranged binary decimal value
    static int min(int a) {
        String s = toBinary(a);  // Convert to binary string
        int countOnes = 0;

        // Count the number of '1's in the binary representation
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                countOnes++;
            }
        }

        // Create a new binary string with all '0's followed by all '1's
        StringBuilder result = new StringBuilder();
        int zeroCount = s.length() - countOnes;

        // Append zeros
        for (int i = 0; i < zeroCount; i++) {
            result.append('0');
        }

        // Append ones
        for (int i = 0; i < countOnes; i++) {
            result.append('1');
        }

        // Convert the rearranged binary string back to decimal
        return toDecimal(result.toString());
    }
}
