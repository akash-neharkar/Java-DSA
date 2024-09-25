package BasicCodes;

import java.util.*;

public class duolified {
    public static void main(String[] args) {
        String s = "Balloon";
        System.out.println(duolify(s));
    }

    public static int duolify(String s){
        HashSet<Character> seen = new HashSet<>();
        int count = 0;

        for (char ch : s.toCharArray()){
            if(seen.contains(ch)){
                count += 1;
            }
            else {
                count += 2;
                seen.add(ch);
            }
        }
        return count;
    }
}
