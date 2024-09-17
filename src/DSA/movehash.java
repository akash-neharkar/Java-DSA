package DSA;

public class movehash {
    public static void main(String[] args) {
        String originalString = "a#b#c#d######";
        String newString = moveHashes(originalString);
        System.out.println(newString);
    }

        public static String moveHashes(String str) {
            int hashCount = 0;
            StringBuilder result = new StringBuilder();

            for (char c : str.toCharArray()) {
                if (c == '#') {
                    hashCount++;
                } else {
                    result.append(c);
                }
            }

            StringBuilder hashesAtFront = new StringBuilder();
            for (int i = 0; i < hashCount; i++) {
                hashesAtFront.append('#');
            }

            return hashesAtFront.append(result).toString();
        }
    }

