package Accenture;
import java.util.*;

public class DistanceBetweenThreePoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of x1: ");
        int x1 = in.nextInt();
        System.out.println("Enter the value of x2: ");
        int x2 = in.nextInt();
        System.out.println("Enter the value of y1: ");
        int y1 = in.nextInt();
        System.out.println("Enter the value of y2: ");
        int y2 = in.nextInt();
        System.out.println("Enter the value of x3: ");
        int x3 = in.nextInt();
        System.out.println("Enter the value of y3: ");
        int y3 = in.nextInt();

        System.out.println("Distance between A and B = " + distance(x1, y1, x2, y2));
        System.out.println("Distance between B and C = " + distance(x2, y2, x3, y3));
        System.out.println("Distance between A and C = " + distance(x1, y1, x3, y3));

    }

    static double distance (double x1, double y1, double x2, double y2){
        double a = x2 - x1;
        double b = y2 - y1;

        return Math.sqrt((a*a) + (b*b));
    }
}
