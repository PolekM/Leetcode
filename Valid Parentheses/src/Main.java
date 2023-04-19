import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        isValid("()(){}");
    }
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.isEmpty()) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                switch (s.charAt(i)){
                    case(')'):
                        if(stack.pop()!='(')
                            return false;
                        break;
                    case(']'):
                        if(stack.pop()!='[')
                            return false;
                        break;
                    case('}'):
                        if(stack.pop()!='{')
                            return false;
                        break;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }

}