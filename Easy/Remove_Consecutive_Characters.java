/*
Problem Statement:

Given a string 'S', you need to remove all the consecutive duplicates.

Write a program to remove all consecutive duplicates from the given string.

Write a function 'removeConsecutiveCharacter' that takes a string 'S' and returns the modified string after removing consecutive duplicates.

Function Signature: 
    public String removeConsecutiveCharacter(String S)

Input:
- A string 'S' (1 <= |S| <= 100) consisting of only lowercase English letters.

Output:
- A string representing the modified string after removing consecutive duplicates.

Example:

Input:
S = "aabb"

Output:
"ab"

Explanation:
- In the given string "aabb", the consecutive duplicates are 'aa' and 'bb' which are removed to get the modified string "ab".

Note:
- You may assume that there is always at least one character in the string.
*/


public class Remove_Consecutive_Characters
{
    public String removeConsecutiveCharacter(String S){
        
        S+=" ";
        String newString = "";
        for (int i = 1; i<S.length(); i++)
        {
            if (S.charAt(i-1)!=S.charAt(i))
            {
                newString+=S.charAt(i-1);
            }
        }
        
        return newString;
        
    }

    public static void main(String args[])
    {
        Remove_Consecutive_Characters obj = new Remove_Consecutive_Characters();
        System.out.println(obj.removeConsecutiveCharacter("aabb"));
    }
}