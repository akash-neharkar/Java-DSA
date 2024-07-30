import java.sql.SQLOutput;
import java.util.Scanner;
//Practice

class calculator{
    public void add(int n1, int n2){
        int result = n1 + n2;
        System.out.println("Addition of two values = " + result);
    }
}

public class timepass {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        //Data types
        int i = 10;
        short sh = 12;
        long l = 12;
        byte b = 12;
        float f = 5.8f;
        double d = 5.8;
        boolean bo = true;
        char c = 'A';

        if (i >= 11){
            System.out.println("Hello");
        }
        else{
            System.out.println("Bye");
        }

        calculator calc = new calculator();
        calc.add(10,15);// accessing the object from other class

    }
}


