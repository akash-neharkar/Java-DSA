package DSA;
import java.util.*;

public class SolveEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the values of a, b : ");
        double a =  in.nextInt();
        double b =  in.nextInt();
        double result = solve(a, b);
        System.out.println(result);
    }

    public static double power(double a, double b){
        double result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
    public static double solve(double a, double b){
        return  power(a, 3) + power(a, 2)*b + 2*power(a,2)*b + 2*power(a*b,2) + power(a*b, 2) + power(b, 3);
    }
}
