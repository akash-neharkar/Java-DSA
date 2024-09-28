package Accenture;
import java.util.Scanner;

public class RatFood {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the value of r: ");
        int r = in.nextInt();
        System.out.println("Enter the unit: ");
        int unit = in.nextInt();
        System.out.println("Enter the size of the array n: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Number of houses sufficient = " + foodcalcalculate(r, unit, arr, n));
    }

    static int foodcalcalculate(int r, int unit, int[] arr, int n){

        if(arr.length == 0){
            return -1;
        }

        int result = r*unit;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            count++;
            if (sum > result){
                break;
            }
        }

        if (sum < result) {
            return 0;
        }

        return count;
    }
}
