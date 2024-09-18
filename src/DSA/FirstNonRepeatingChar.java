package DSA;
import java.util.*;

public class FirstNonRepeatingChar {

    public static void main(String[] args) {
        String str = "swiss";
        char result = firstNonRepeatingCharacter(str);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("There is no non-repeating character.");
        }
    }

    public static char firstNonRepeatingCharacter(String str) {
        // Edge case: If the string is empty
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input string is empty.");
        }

        // Step 1: Count occurrences of each character
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find the first character with a count of 1
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        // No non-repeating character found
        return '\0'; // Indicates no non-repeating character
    }
}
