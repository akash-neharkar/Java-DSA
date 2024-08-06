package DSA;

public class Maze {
    public static void main(String[] args) {
        int ans = countpaths(3,3);
        System.out.println(ans);
    }

    static int countpaths(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = countpaths(r-1, c);
        int right = countpaths(r, c-1);
        return left+right;
    }
}
