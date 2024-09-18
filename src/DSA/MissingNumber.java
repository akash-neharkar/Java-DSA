package DSA;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 8};
        System.out.println(missing(arr));
    }

    public static int missing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) {
                return arr[i - 1] + 1;
            }
        }
        return -1;
    }
}
