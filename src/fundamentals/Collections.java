package fundamentals;
import java.util.*;


public class Collections {
    public static void main(String[] args) {

        //ArrayList
        System.out.println("These are values of an ArrayList");
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(5);
        nums.add(4);

        for (Integer num : nums) {
            System.out.println(num);
        }


        //Set (A set supports unique values)
        //HashSet
        System.out.println("These are values of a HashSet");
        Set<Integer> nums1 = new HashSet<>();
        nums1.add(6);
        nums1.add(7);
        nums1.add(8);
        nums1.add(9);
        nums1.add(5);
        nums1.add(6);

        System.out.println(nums1);


        //TreeSet
        System.out.println("These are values of a TreeSet");
        Set<Integer> nums2 = new TreeSet<>();
        nums2.add(61);
        nums2.add(74);
        nums2.add(85);
        nums2.add(99);
        nums2.add(51);
        nums2.add(62);

        System.out.println(nums2);


        //Maps
        //HashMap
        System.out.println("This is a HashMap");
        Map<String, Integer> students = new HashMap<>();
        students.put("Akash", 40);
        students.put("Khushi", 51);
        students.put("Ansh", 1);
        students.put("Pranav", 24);
        students.put("Ashish", 37);

        for (String key : students.keySet()){
            System.out.println(key + " : " +  students.get(key));
        }

    }
}
