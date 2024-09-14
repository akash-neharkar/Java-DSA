package DSA;

public class bitwise {
    public static void main(String[] args) {
        int n = 0b00001101; //13
        int k = 3;
        System.out.println("The kth bit is set? " + check(n, k));
        System.out.println("Number after setting kth bit: " + set(n, k));
        System.out.println("Number after resetting kth bit: " + reset(n, k));
        System.out.println("Number after toggling the kth bit: " + toggle(n, k));
        System.out.println("Number after left shift: " + left(n));
        System.out.println("Number after right shift: " + right(n));
        System.out.println("n%k = " + modulo(n, k));
    }

    //Function to check if kth bit is set
    public static boolean check(int n, int k) {
        return (n & (1 << k)) != 0;
    }

    // Function to set kth bit
    public static int set(int n, int k) {
        return n | (1 << k);
    }

    // Function to reset kth bit
    public static int reset(int n, int k) {
        return n & (~(1 << k));
    }

    // Function to toggle kth bit
    public static int toggle(int n, int k) {
        return n ^ (1 << k);
    }

    //Function to left shift
    public static int left(int n){
        return n << 1;
    }

    //Function to right shift
    public static int right(int n){
        return n >> 1;
    }

    //Function to find modulo
    public static int modulo(int n, int k) {
        return n & ((1 << k)-1);
    }
}

