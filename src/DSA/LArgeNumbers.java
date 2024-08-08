package DSA;
import java.math.BigInteger;

public class LArgeNumbers {
    public static void main(String[] args) {
        int a = 20;
        int b = 21;

        BigInteger c = BigInteger.valueOf(30);
        BigInteger d = BigInteger.valueOf(41);
        BigInteger e = new BigInteger("271632469172210928301246");   // To store large values

        BigInteger f = BigInteger.TEN;  //Constant

        BigInteger s = c.add(d);
        System.out.println(s);
    }
}
