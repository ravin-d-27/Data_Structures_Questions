/*
Problem Statement:

Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

Write a program to check if the input string is valid according to the following rules:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

Write a function 'isValid' that takes a string 's' and returns true if it is a valid parenthesis expression, false otherwise.

Function Signature: 
    public boolean isValid(String s)

Input:
- A string 's' (1 <= |s| <= 10^4) consisting of printable ASCII characters.

Output:
- A boolean value representing whether the input string is a valid parenthesis expression or not.

Example:

Input:
s = "()[]{)}"

Output:
false

Explanation:
- The string "()[]{)}" contains an invalid closing bracket '}' for the opening bracket '{'. Hence, it is not a valid parenthesis expression.

Note:
- You may assume that the input string contains only printable ASCII characters.
*/


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
