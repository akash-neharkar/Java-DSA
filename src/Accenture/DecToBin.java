package Accenture;

public class DecToBin {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(convert(a));
    }

    static int convert(int a){

        if ( a == 0) return 0;

        StringBuilder result = new StringBuilder();

        while(a > 0){
            int rem = a%2;
            result.insert(0, rem);
            a = a/2;
        }

        //if you want only conversion:
//        return result.toString();

        //Addition of the binary digits:
        int sum = 0;
        char[] finall = result.toString().toCharArray();
        for (int i = 0; i < finall.length; i++) {
            sum += finall[i] - '0';
        }

        return sum;
    }
}
