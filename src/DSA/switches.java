package DSA;
import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        System.out.println(switchnow(s));
    }

    public static String switchnow(String s) {
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            switch (currentChar) {
                case '0':
                    countzero++;
                    break;
                case '1':
                    countone++;
                    break;
                case '2':
                    counttwo++;
                    break;
                default:
                    break;
            }
        }

        char finalZeroState = (countzero % 2 == 0) ? '0' : '1';
        char finalOneState = (countone % 2 == 0) ? '0' : '1';
        char finalTwoState = (counttwo % 2 == 0) ? '0' : '1';

        return "" + finalZeroState + finalOneState + finalTwoState;
    }
}