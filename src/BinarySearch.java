import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18,-12,0,4,5,6,7,8,9,10,12,115};
        int target = -18;
        int ans = binarysearch(arr, target);
//        System.out.println(ans);


        int[][] arr1 = {{3,4,5},{6,7,8},{9,10,11}};
        System.out.println(Arrays.toString(search(arr1,10)));
    }

    //Binary search in 1D array
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end-start)/2; // since (start-end)/2 might exceed length

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    //Binary search in 2D array
    static int[] search(int[][] matrix, int target1){
        int r = 0;
        int c = matrix.length-1;

        while (r < matrix.length && c>=0){
            if(matrix[r][c] == target1){
                return new int[]{r, c};
            }
            if (matrix[r][c] < target1){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
