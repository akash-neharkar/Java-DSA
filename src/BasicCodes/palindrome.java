package BasicCodes;

public class palindrome {
    public static void main(String[] args) {
        String s = "mom";
        System.out.println(palindromecheck(s));
    }

    public static boolean palindromecheck(String s){
        int start = 0;
        int end = s.length() - 1;

        while(start <= end) {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(start) != s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
