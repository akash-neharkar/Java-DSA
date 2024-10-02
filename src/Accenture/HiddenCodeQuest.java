package Accenture;

public class HiddenCodeQuest {

    public static void main(String[] args) {
        String S1 = "abcde";
        String S2 = "abfce";

        int result = findHiddenCode(S1, S2);
        System.out.println("The sum of the ASCII values of the longest common substring is: " + result);
    }

    public static int findHiddenCode(String S1, String S2) {
        int m = S1.length();
        int n = S2.length();

        // Create a DP table to store lengths of longest common suffixes
        int[][] dp = new int[m + 1][n + 1];
        int maxLen = 0;
        int endIndexS1 = 0;  // To store the end index of the longest common substring in S1

        // Fill the dp array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (S1.charAt(i - 1) == S2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndexS1 = i;  // Track the end index of the longest common substring
                    }
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        // If no common substring exists, return 0
        if (maxLen == 0) {
            return 0;
        }

        // Get the longest common substring
        String longestCommonSubstring = S1.substring(endIndexS1 - maxLen, endIndexS1);

        // Calculate the sum of ASCII values of characters in the longest common substring
        int asciiSum = 0;
        for (char c : longestCommonSubstring.toCharArray()) {
            asciiSum += (int) c;
        }

        return asciiSum;
    }

}

