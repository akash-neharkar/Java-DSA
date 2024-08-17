package DSA;

public class palindrome {
    public static void main(String[] args) {
        String test = "ABCDEFGHHGFEDCBAASCSCSDW";
        System.out.println(palindromeCheck(test));
    }

    public static boolean palindromeCheck(String test){
        int start = 0;
        int end = test.length() - 1;

        while (start < end){
            if (test.charAt(start)!= test.charAt(end)){
                return false;
            }
            start += 1;
            end -= 1;
        }
        return true;
    }

}
