package BasicCodes;
import java.util.*;

public class rotatelist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int d = 3;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(33);
        list.add(43);
        list.add(53);
        list.add(63);

        rotate(list, d);
    }

    public static void rotate(ArrayList<Integer> list, int d){
        for (int i = 0; i < d; i++) {
            int last = list.removeLast();
            list.addFirst(last);
        }
        System.out.println(list);
    }
}
