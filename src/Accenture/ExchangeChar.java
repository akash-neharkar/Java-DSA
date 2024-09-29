package Accenture;
import java.util.*;

public class ExchangeChar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String");
        String str = in.next();
        System.out.println("Enter the char 1: ");
        char ch1 = in.next().charAt(0);
        System.out.println("Enter the char 2: ");
        char ch2 = in.next().charAt(0);

        System.out.println(exchange(str, str.length(), ch1, ch2));

    }

    static String exchange(String str, int n, char ch1, char ch2) {

        n = str.length();

        if (str.isEmpty()) return null;

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ch1) {
                res.append(ch2);
            } else if (str.charAt(i) == ch2) {
                res.append(ch1);
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
