package DSA;

public class valleyHiking {
    public static void main(String[] args) {
        String s = "UDDDUDUUUUDDUUUDDD";

        int countu = 0;
        int countd = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            if(s.charAt(i) == 'U' || s.charAt(i) == 'u'){
                countu += 1;
            } else if (s.charAt(i) == 'D' || s.charAt(i) == 'd') {
                countd += 1;
            }
            else {
                return;
            }
        }

        System.out.println(countu - countd);

    }
}
