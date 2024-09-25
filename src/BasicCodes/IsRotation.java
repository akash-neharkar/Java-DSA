package BasicCodes;

public class IsRotation{
    public static void main(String[] args) {
        String s1 = "WaterBottle";
        String s2 = "erBottleWat";

        System.out.println(isrotation(s1, s2));
    }

    public static boolean isrotation(String s1, String s2){
        if(s1.length() != s2.length() || s2.length() == 0 ){
            return false;
        }

        String concat = s1 + s2;

        return issubstring(concat, s2);
    }

    public static boolean issubstring(String concat, String s2) {
        for (int i = 0; i <= concat.length() - s2.length(); i++) {
            int j;
            for (j = 0; j < s2.length(); j++) {
                if(concat.charAt(i+j) != s2.charAt(j)){
                    break;
                }
            }
            if (j == s2.length()) {
                return true;
            }
        }
        return false;
    }
}
