package DSA;
import java.util.*;

public class MaxDifference {
    public static void main(String[] args) {

        int[] arr = {4,2,6,12,15};
        int N = maxdifference(arr);
        System.out.println(N);
        
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    public static int maxdifference(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - 1; j++) {
                    //return Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
                return max(arr) - min(arr);

            }
        }
        return -1;
    }
}
