package BasicCodes;

public class BasicOperations {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        System.out.println("Input array:");
        printarray(array);
        reversearray(array);
        System.out.println("Reversed array:");
        printarray(array);
    }

    public static void reversearray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
         }
    }

    public static void printarray(int[] arr){
        for (int element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
