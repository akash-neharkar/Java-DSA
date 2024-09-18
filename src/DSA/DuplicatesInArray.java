package DSA;
import java.util.*;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 22, 33, 44, 44, 55, 66, 77, 77, 88, 99};
        System.out.println(findDuplicates(arr));
    }

    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicates = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the current element is the same as the next element
            if (arr[i] == arr[i + 1]) {
                // Add to duplicates list only if not already present
                if (duplicates.isEmpty() || !duplicates.getLast().equals(arr[i])) {
                    duplicates.add(arr[i]);
                }
            }
        }

        return duplicates;
    }
}
