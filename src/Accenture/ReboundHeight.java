package Accenture;

import java.util.Scanner;

public class ReboundHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the initial Height H: ");
        int H = in.nextInt();
        System.out.println("Enter the value of Initial velocity V: ");
        int V = in.nextInt();
        System.out.println("Enter the value of Final velocity Vn: ");
        int Vn = in.nextInt();

        System.out.println("Final rebound Height H` = " + height(H,V,Vn));


    }

    static double height( int H, int V, int Vn){

        int eN = V/Vn;

        double Hdash = H * Math.pow(eN, 2);

        return Hdash;
    }

}
