package Accenture;
import java.util.*;

public class BMIcalculator{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the weight in Kgs: ");
        int W = in.nextInt();
        System.out.println("Enter the height in meters: ");
        double H = in.nextDouble();

        System.out.print(calculate(W, H));

    }


    static double calculate(int W, double H){
        double BMI = W/Math.pow(H,2);

        if(BMI <=18) return 0;
        if(BMI >= 18 && BMI < 25) return 1;
        if(BMI >= 25 && BMI < 30) return 2;
        if(BMI >= 30 && BMI < 40) return 3;
        if(BMI >= 40) return 4;
        else return -1;
    }
}