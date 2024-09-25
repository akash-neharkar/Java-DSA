package BasicCodes;
import java.util.*;

public class BalancedParentheses {
    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(valid(s));
    }

    public static boolean valid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case '[':
                case '{':
                case '(':
                    stack.push(ch);
                    break;

                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}










