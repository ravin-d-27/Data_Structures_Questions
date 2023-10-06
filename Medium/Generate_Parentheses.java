

/**
 * Problem Statement:
 *
 * Given a positive integer 'n', generate all combinations of well-formed parentheses.
 *
 * Example:
 * Input: n = 3
 * Output: ["((()))", "(()())", "(())()", "()(())", "()()()"]
 *
 * Note:
 * - The solution set must not contain duplicate combinations.
 *
 * Approach:
 * - Keep track of open and close parentheses, and add valid combinations to the result list.
 *
 * Pseudocode:
 *
 * function generateValidParenthesis(result, current, open, close, n):
 *   if length of current string is 2n:
 *     add current string to result
 *     return
 *   if open < n:
 *     recursively call generateValidParenthesis with updated parameters
 *   if close < open:
 *     recursively call generateValidParenthesis with updated parameters
 *
 * function generateParenthesis(n):
 *   Initialize an empty list 'result'
 *   Call generateValidParenthesis with initial parameters
 *   Return the result list
 */

import java.util.*;
public class Generate_Parentheses {

    static List <String> temp = new ArrayList<>();

    public static void backTracking(String str, String perm, int index)
    {
        if (str.length() == 0)
        {
            temp.add(perm);
            return;
        }

        for (int i = 0; i<str.length(); i++)
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            backTracking(newStr, currChar+perm, index+1);
        }
    }

    private static boolean isMatching(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }
    public static boolean isValid(String s) {
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

    public List<String> generateParenthesis(int n) {
        List <String> output = new ArrayList<>();
        Set <String> temp2 = new HashSet<>();
        String str = "";
        for (int i = 0; i<n; i++)
        {
            str+="()";
        }
        backTracking(str, "", 0);
        
        for (String s: temp)
        {
            if (isValid(s))
            {
                temp2.add(s);
            }
        }

        for (String s: temp2)
        {
            output.add(s);
        }
        temp.clear();
        return output;
    }


    public static void main(String args[])
    {
        Generate_Parentheses obj = new Generate_Parentheses();
        System.out.println(obj.generateParenthesis(1));
    }
}
