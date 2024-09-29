package Accenture;
import java.util.*;

public class SumOfFactors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        System.out.println("Enter the value of m: ");
        int m = in.nextInt();

        System.out.println(sum(m, n));

    }

    static int sum(int m, int n) {
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i <= m ; i++) {
            if(i % n == 0){
                sum1 = sum1 + i;
            }
            else{
                sum2 = sum2 + i;
            }
        }
        return Math.abs(sum1 - sum2);
    }
}
