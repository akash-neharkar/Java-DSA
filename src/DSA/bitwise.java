package DSA;

public class bitwise {
    public static void main(String[] args) {
        int n = 0b10001001; //137
        int k = 4;
        System.out.println(set(n, k));
        System.out.println(reset(n, k));
        System.out.println(left(n));
        System.out.println(right(n));
    }

    // Function to set kth bit
    public static int set(int n, int k) {
        return n | (1 << (k - 1));
    }

    // Function to set kth bit
    public static int reset(int n, int k) {
        return n & (~(1 << (k - 1)));
    }

    //Function to left shift
    public static int left(int n){
        return n << 1;
    }

    //Function to right shift
    public static int right(int n){
        return n >> 1;
    }
}

