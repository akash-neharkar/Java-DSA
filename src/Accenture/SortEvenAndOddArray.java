package Accenture;
import java.util.*;

public class SortEvenAndOddArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = in.nextInt();
        }
        System.out.println(sorted(arr));

    }

    static int sorted(int[] arr){

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < arr.length; i+=2) {
            even.add(arr[i]);
        }
        for (int i = 1; i < arr.length; i+=2) {
            odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        System.out.println("Even array = ");
        for (int k : even){
            System.out.print(k + " ");
        }

        System.out.println(" ");

        System.out.println("Odd array = ");
        for (int k : odd){
            System.out.print(k + " ");
        }

        System.out.println(" ");

        System.out.println("Sum = ");

        return even.get(even.size() - 2) + odd.get(odd.size() - 2);
    }
}
