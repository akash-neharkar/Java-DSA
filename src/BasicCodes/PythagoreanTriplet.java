package BasicCodes;
import java.util.*;

public class PythagoreanTriplet {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the limit:");
            int limit = in.nextInt();

            System.out.println("Pythagorean triplets with values smaller than " + limit + " are:");
            generatePythagoreanTriplets(limit);
        }

        public static void generatePythagoreanTriplets(int limit) {
            for (int a = 1; a < limit; a++) {
                for (int b = a + 1; b < limit; b++) {
                    int cSquared = a * a + b * b;
                    int c = (int) Math.sqrt(cSquared);

                    if (c * c == cSquared && c < limit) {
                        System.out.println(a + ", " + b + ", " + c);
                    }
                }
            }
        }
    }

