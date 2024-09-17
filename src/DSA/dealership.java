package DSA;
import java.util.*;

public class dealership {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cars;
        int bikes;

        System.out.println("Enter Number of Dealerships: ");
        int dealerships = in.nextInt();

        for (int i = 1; i <= dealerships; i++) {
            System.out.println("Enter the Number of Cars for Dealership "+ i);
            cars = in.nextInt();
            System.out.println("Enter the Number of bikes for Dealership "+ i);
            bikes = in.nextInt();
            int totaltyers = cars*4 + bikes*2;

            System.out.println("Total Tyres for Dealership " + i + " = " + totaltyers);
        }

    }
}
