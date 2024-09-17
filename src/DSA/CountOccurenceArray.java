package DSA;
import java.util.HashMap;
import java.util.Map;

public class CountOccurenceArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6, 6};

        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array and update the count of each element
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " occurs " + entry.getValue() + " times");
        }
    }
}
