package Accenture;

public class ShipTransport {

    public static void main(String[] args) {
        int C = 30;
        int N = 75;

        System.out.println(trasnport(C, N));
    }

    static int trasnport(int C, int N){

        int remainder = N%C;
        int quotient = N/C;
        int count = 0;

        if(remainder == 0){
            return quotient;
        }
        else {
            count += 1;
            return quotient+count;
        }
    }
}
