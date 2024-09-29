package Accenture;
import java.util.*;

public class BinaryOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.next();
        System.out.println(calculate(str));

    }

    public static int calculate(String str){

        if(str.isEmpty()){
            return -1;
        }

        int result = str.charAt(0) - '0';  //Subtracted 0 to convert into an integer

        for (int i = 1; i < str.length(); i+=2) {

            char operator = str.charAt(i);
            int nextbit = str.charAt(i+1) - '0'; //

            if(operator == 'A'){
                result &= nextbit;
            }
            if(operator == 'B'){
                result |= nextbit;
            }
            if (operator == 'C'){
                result ^= nextbit;
            }
        }
        return result;
    }
}
