package Accenture;

public class SubstringCounter {

    public static void main(String[] args) {
        String str = "1001abc11100001";
        System.out.println("Number of substrings of the form 1[0]*1: " + countSubstrings(str));
    }

    public static int countSubstrings(String str) {
        int count = 0;
        int n = str.length();

        for (int i = 0; i < n; i++) {
            // Check if the current character is '1'
            if (str.charAt(i) == '1') {
                // Look for the next '1' while allowing '0's in between
                int j = i + 1;
                while (j < n && str.charAt(j) == '0') {
                    j++;
                }

                // If we found another '1' after some '0's (or no '0's)
                if (j < n && str.charAt(j) == '1') {
                    count++;
                    i = j - 1; // Move the index forward to avoid overlapping counts
                }
            }
        }

        return count;
    }
}
