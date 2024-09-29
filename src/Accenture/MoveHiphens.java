package Accenture;
import java.util.*;

public class MoveHiphens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = in.next();

        System.out.println(move(str));
    }

    static String move(String str){

        if(str.isEmpty()) return " ";

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '-'){
                count += 1;
            }
        }

        if(count > 0){
            for (int i = 0; i < count; i++) {
                str1.append('-');
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) != '-'){
                str2.append(str.charAt(i));
            }
        }

        return str1.toString() + str2.toString();
    }
}