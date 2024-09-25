package BasicCodes;

public class CountSpaces {
    public static void main(String[] args) {
        String s1 = "He lo lo Wo il eo";
        String s2 = "Hello World";

        int counts1 = 0;
        int counts2 = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == ' ') {
                counts1++;
            }
        }

        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == ' ') {
                counts2++;
            }
        }

        int last = counts1 - counts2;

        if (last % 2 == 0) {
            System.out.println("Even " + last);
        } else {
            System.out.println("Odd " + last);
        }
    }
}
