import java.util.Stack;

/**
 * @author 86188
 */
public class 括号匹配 {
    public boolean isValid(String str) {
        int left = 0;
        for (int i = 0; i != str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c == '(') {
                left++;
            } else {
                left--;
            }
            if (left < 0) {
                return false;
            }
        }
        return left == 0;
    }
    public boolean isVaild2(String str) {
        Stack<Character> left = new Stack<Character>();
        for (int i = 0; i != str.length() - 1; i++) {
            char c = str.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                left.push(c);
            }
            if (!left.empty() && left.peek() == ')') {
                left.pop();
            } else {
                return false;
            }
        }
        return left.empty();
    }

}
