package Accenture;
import java.util.*;

public class NBaseNotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int num = sc.nextInt ();
        System.out.println (dectoNBase (n, num));
    }

    public static String dectoNBase (int n, int num) {

        String res = "";  // This will store the final result
        int quotient = num / n;  // Get the quotient of the number divided by the base
        ArrayList<Integer> rem = new ArrayList<Integer>();  // List to store the remainders

        // Add the first remainder (num % n) to the list
        rem.add(num % n);

        // Continue dividing by the base and storing the remainders until the quotient is zero
        while (quotient != 0) {
            rem.add(quotient % n);  // Add the remainder of the quotient
            quotient = quotient / n;  // Update the quotient
        }

        // Now, convert the remainders into digits/letters from the ArrayList
        for (int i = 0; i < rem.size(); i++) {
            if (rem.get(i) > 9) {  // For remainders greater than 9, convert to letters (A, B, etc.)
                res = (char) (rem.get(i) - 9 + 64) + res;
            } else {  // For remainders less than 10, just add the number itself
                res = rem.get(i) + res;
            }
        }
        return res;  // Return the result
    }

}
