package BasicCodes;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 15;
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    static int fib(int num){
        if(num <= 1){
            return num;
        }
        return fib(num - 1) + fib(num - 2);
    }
}
