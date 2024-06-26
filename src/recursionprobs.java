import java.util.Scanner;

public class recursionprobs {
    public static void main(String[] args) {
//        fun(5);
//        funrev(5);
//        funjoin(3);
        int ans = productofdigits(1034);
        System.out.println(ans);
    }

    //Function to print numbers n to 1
    static void fun(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    //Function to print numbers 1 to n
    static void funrev(int n){
        if (n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }

    //Function to print numbers n to 1 and 1 to n
    static void funjoin(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        funjoin(n-1);
        System.out.println(n);
    }

    //Factorial of a number
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n*fact(n-1);
    }

    //Sum of n numbers
    static int sum(int n){
        if (n == 1){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    //Sum of digits of a number
    static int sumofdigits(int n){
        if (n == 0){
            return 0;
        }
        return (n%10) + sumofdigits(n/10);
    }

    //product of digits of a number
    static int productofdigits(int n){
        if (n%10 == n){
            return n;
        }
        return (n%10) * productofdigits(n/10);
    }

}




