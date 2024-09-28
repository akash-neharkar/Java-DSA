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

    static int sum(int m, int n){
        ArrayList<Integer> divisible = new ArrayList<>();
        ArrayList<Integer> notdivisible = new ArrayList<>();

        for (int i = 1; i <= m ; i++) {
            if (i%n == 0){
                divisible.add(i);
            }
            else{
                notdivisible.add(i);
            }
        }

        int sumofdivisibles = 0;
        int sumofnotdivisibles = 0;

        for (int k : divisible){
            sumofdivisibles += k;
        }

        for (int j : notdivisible){
            sumofnotdivisibles += j;
        }
        return sumofnotdivisibles - sumofdivisibles;
     }
}
