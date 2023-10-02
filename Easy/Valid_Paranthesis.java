import java.util.*;
public class Valid_Paranthesis {

    private boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return false; 
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty(); 
    }

    public static void main(String args[])
    {
        Valid_Paranthesis obj = new Valid_Paranthesis();
        System.out.println(obj.isValid("()[]{)}"));
    }
    
}
