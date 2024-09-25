package BasicCodes;

public class compressString{
    public static void main(String[] args) {
        String s= "aabbccccddd";
        System.out.println(compress(s));
    }

    public static String compress(String s){

        if(s.length() == 0 ||  s == null){
            return s;
        }

        StringBuilder list = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count += 1;
            }
            else{
                list.append(s.charAt(i-1));
                if(count > 1){
                    list.append(count);
                }
                count = 1;
            }
        }

        list.append(s.charAt(s.length()-1));
        if (count > 1){
            list.append(count);
        }
        return list.toString();
    }
}