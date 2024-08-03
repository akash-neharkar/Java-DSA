package fundamentals;

public class Loops {
    public static void main(String[] args) {

        int[] arr = new int[4];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 5;
        arr[3] = 6;

        //Normal For loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //Enhanced or ForEach Loop
        for (int n : arr){
            System.out.println(n);
        }
    }
}
