package BasicCodes;
import java.util.*;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};

        int[] result = intersect(arr1, arr2);

        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] intersect(int[] arr1, int[] arr2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for (int a : arr1){
            h1.add(a);
        }

        for (int a : arr2){
            if (h1.contains(a)) {
                h2.add(a);
            }
        }

        int[] result = new int[h2.size()];
        int i = 0;
        for (int num : h2) {
            result[i++] = num;
        }

        return result;
    }
}

