package DSA;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,5,7,6};
        int target = 6;
//        System.out.println(linearsearch(arr, target));

        int[][] arr1 = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int target1 = 9;
        int[] ans = search(arr1, target1);
        System.out.println(Arrays.toString(ans));
    }

    //Linear search in 1D array
    static int linearsearch (int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }


    //Linear search in 2D array
    static int[] search (int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
