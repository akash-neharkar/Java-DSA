    package BasicCodes;
    import java.util.Scanner;


    public class Patterns {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the value of n");
            int n = in.nextInt();
            System.out.println("Pattern 1: ");
            pattern(n);
            System.out.println("Pattern 2: ");
            pattern1(n);
            System.out.println("Pattern 3: ");
            pattern2(n);
            System.out.println("Pattern 4: ");
            pattern3(n);
        }

        static void pattern(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern1(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern2(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n-i+1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        static void pattern3(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

    }
