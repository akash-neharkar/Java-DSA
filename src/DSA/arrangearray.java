package DSA;

import java.util.*;

public class arrangearray {
    public static void main(String[] args) {
        int[] arr = {4,6,2,7,9,5,1,3,8};
        Arrays.sort(arr);
        ArrayList<Integer> arranged = new ArrayList<>();

        int left = arr[0];
        int right = arr.length - 1;

        while(left <= right){
            if(left != right){
                arranged.add(right);
                arranged.add(left);
            }
            else{
                arranged.add(left);
            }
            left ++;
            right--;
        }
        System.out.println(arranged);
    }
}
