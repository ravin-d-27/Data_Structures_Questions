import java.util.Stack;

public class infix_to_postfix {

    public static int precedence(char ch) {
        if (ch == '+' || ch == '-')
            return 1;
        else if (ch == '*' || ch == '/')
            return 2;
        else if (ch == '^')
            return 3;
        else
            return -1;
    }

    public String infixToPostfix(String infix) {
        Stack<Character> st = new Stack<>();
        String result = "";

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            } else if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result += st.pop();
                }

                if (!st.isEmpty() && st.peek() != '(') {
                    return "Invalid Expression";
                } else {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())) {
                    if (st.peek() == '(') {
                        return "Invalid Expression";
                    }
                    result += st.pop();
                }
                st.push(ch); 
            }
        }

        while (!st.isEmpty()) {
            if (st.peek() == '(') {
                return "Invalid Expression";
            }
            result += st.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "a+b*c";
        infix_to_postfix obj = new infix_to_postfix();
        System.out.println(obj.infixToPostfix(s));
    }
}
