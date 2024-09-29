package Accenture;
import java.util.*;

public class DivisiblebyThreeAndFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of m: ");
        int m = in.nextInt();
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();

        System.out.println(sum(m, n));

    }

    static int sum(int m, int n){

        int sum = 0;

        for (int i = m; i <= n ; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                sum = sum + i;
            }
        }

        return sum;
    }

}
