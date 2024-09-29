package Accenture;

import java.util.Scanner;

public class OperationChoices {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = in.nextInt();
        System.out.println("Enter the value of b: ");
        int b = in.nextInt();
        System.out.println("Enter the value of c: ");
        int c = in.nextInt();

        System.out.println(operationchoice2(a, b, c));

    }

    //using if else
    static int operationchoice(int a, int b, int c){

        if(c == 1) return a+b;
        if(c == 2) return a-b;
        if(c == 3) return a*b;
        if(c == 4) return a/b;
        else return 1;

    }

    //using switch
    static int operationchoice2(int a, int b, int c){

        int res = 0;

        switch (c){
            case 1: res = a+b; break;
            case 2: res = a-b; break;
            case 3: res = a*b; break;
            case 4: res = a/b; break;
        }
        return res;
    }

}
