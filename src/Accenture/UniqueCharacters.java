package Accenture;
import java.util.*;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String str = in.next();

        System.out.println(count(str));

    }

    static int count(String str){
        char[] arr = str.toCharArray();

        HashSet<Character> results = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            results.add(arr[i]);
        }
        System.out.println(results);
       return results.size();
    }

}
