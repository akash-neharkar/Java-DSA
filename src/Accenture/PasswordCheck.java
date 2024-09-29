package Accenture;

import java.util.*;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Password: ");
        String str = in.next();
        System.out.println(CheckPassword(str, str.length()));

    }

    static int CheckPassword(String str, int n){
        if(str.isEmpty()) return 0;
        int cap = 0;
        int num = 0;

        for (int i = 0; i < n; i++) {

            if(n < 4) return 0;

            if(str.charAt(0) >= '0' && str.charAt(0) <= '9') return 0;

            if(str.charAt(i) == ' ' || str.charAt(i) == '/') return 0;

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num += 1;
            }

            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                cap += 1;
            }
        }

        if (cap > 0 && num > 0) return 1;
        else return 0;

    }

}
