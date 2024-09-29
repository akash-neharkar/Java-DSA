package Accenture;
import java.util.*;
import java.util.Collection;

public class SumOfSecondLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length of array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(LargeSmallSum(arr, n));

    }

    static int LargeSmallSum(int[] arr, int n){
        n = arr.length;

        if(n <= 3) return 0;

        ArrayList <Integer> even = new ArrayList<>();
        ArrayList <Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(i % 2 == 0){
                even.add(arr[i]);
            }
            else{
                odd.add(arr[i]);
            }
            Collections.sort(even);
            Collections.sort(odd);
        }
        return even.get(even.size() - 2) + odd.get(odd.size() - 2);
    }

}
