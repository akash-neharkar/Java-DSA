package DSA;
import java.util.*;

public class MaxMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of subjects in sem 1");
        int number = in.nextInt();
        System.out.println("Number of subjects = "+ number);

        System.out.println("Enter the marks obtained in each subject of sem 1");
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Marks obtained in each subject = "+ Arrays.toString(arr));

        int max = maxofarray(arr);
        System.out.println("Max marks obtained = " + max);

    }

    public static int maxofarray(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
