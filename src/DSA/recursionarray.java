package DSA;

public class recursionarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,6};
        System.out.println(linearsearch(arr, 6,0));
//        System.out.println(sort(arr, 0));
    }

    //To check if an array is sorted
    static boolean sort(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index + 1] && sort(arr, index+1);
    }

    //Linear search using recursion
    static int linearsearch(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else{
            return linearsearch(arr, target, index+1);
        }
    }
}
