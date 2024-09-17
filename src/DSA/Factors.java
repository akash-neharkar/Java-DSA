package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    public static void main(String[] args) {
        int a = 18;
        int[] res = factors(a);
        System.out.println(Arrays.toString(res));
    }

    public static int[] factors(int a) {
        ArrayList<Integer> factorList = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                factorList.add(i);
            }
        }

        int[] factorsArray = new int[factorList.size()];
        for (int i = 0; i < factorList.size(); i++) {
            factorsArray[i] = factorList.get(i);
        }

        return factorsArray;
    }
}
