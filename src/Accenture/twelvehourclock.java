package Accenture;
import java.util.*;

public class twelvehourclock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter hours: ");
        int hours = in.nextInt();
        System.out.println("Enter minutes: ");
        int minutes = in.nextInt();

        clock(hours, minutes);
    }

    static void clock(int hours, int minutes) {

        String period;

        if(hours >= 12){
            period = "PM";
            if(hours > 12){
                hours -= 12;
            }
        }
        else {
            period = "AM";
            if(hours == 0){
                hours = 12;
            }
        }
        System.out.println("The time in 12 hour format = " + hours + ":" + minutes + " " + period);
    }

    public static class DecToBin {
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
}
