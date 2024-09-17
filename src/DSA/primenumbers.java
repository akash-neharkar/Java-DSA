package DSA;

public class primenumbers {
    public static void main(String[] args) {
        int a = 21;
        System.out.println(prime(a));
    }

    public static boolean prime(int a){
        if (a <= 1) return false;

        for (int i = 2; i < a; i++) {
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }

}
