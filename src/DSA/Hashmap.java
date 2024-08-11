package DSA;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        //HashCode
        String s = "Akash";
        int code = s.hashCode();
        System.out.println(code);


        //HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Akash", 40);
        map.put("Ashish", 37);
        map.put("Khushi", 51);
        map.put("Ansh", 01);
        System.out.println(map);
        System.out.println(map.get("Akash"));
        System.out.println(map.containsKey("Sudhanshu"));
        System.out.println(map.getOrDefault("Sudhanshu", 23));


        //HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(54);
        set.add(23);
        set.add(40);
        set.add(51);
        set.add(37);
        set.add(54);

        System.out.println(set);

    }
}
