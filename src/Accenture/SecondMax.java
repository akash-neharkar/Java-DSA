package Accenture;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {2, 3, 14, 9, 23, 99, 99, 99, 0, 23};
        System.out.println("Second max: " + secondmax(arr));
    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static int secondmax(int[] arr) {
        sort(arr); // Sort the array first

        int max = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != max) {
                return arr[i];
            }
        }
        return -1;
    }
}
