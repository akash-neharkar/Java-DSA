package DSA;

public class compressString {

    public static void main(String[] args) {
        String originalString = "aaabbcccdddddddddddddddddd";
        String compressedString = compressString(originalString);
        System.out.println(compressedString);
    }

        public static String compressString(String str) {
            if (str == null || str.length() == 0) {
                return str; // Return the original string if it's empty or null
            }

            StringBuilder compressed = new StringBuilder();
            int count = 1; // Start counting from 1

            // Iterate through the string
            for (int i = 1; i < str.length(); i++) {
                // If the current character is the same as the previous one, increment the count
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++;
                } else {
                    // Append the character and its count to the result
                    compressed.append(str.charAt(i - 1));
                    if (count > 1) {
                        compressed.append(count);
                    }
                    count = 1; // Reset the count for the new character
                }
            }

            // Append the last character and its count
            compressed.append(str.charAt(str.length() - 1));
            if (count > 1) {
                compressed.append(count);
            }

            return compressed.toString();
        }



}
