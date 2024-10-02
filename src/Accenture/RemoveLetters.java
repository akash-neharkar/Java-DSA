package Accenture;

public class RemoveLetters {
    public static void main(String[] args) {
        String A = "AABBCC";
        String B = "AB";

        System.out.println(removeLetters(A, B));
    }

    static String removeLetters(String A, String B) {
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            char currentChar = A.charAt(i);

            if (B.indexOf(currentChar) == -1) { //-1 that char is not found in A
                res.append(currentChar);
            }
        }

        return res.toString();
    }
}
