/*
Problem Statement:

Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Write a program to check if the given string is a valid palindrome.

Write a function 'isPalindrome' that takes a string 's' and returns true if it is a valid palindrome, false otherwise.

Function Signature: 
    public boolean isPalindrome(String s)

Input:
- A string 's' (1 <= |s| <= 2 * 10^5) consisting of printable ASCII characters.

Output:
- A boolean value representing whether the string is a valid palindrome or not.

Example:

Input:
s = "A man, a plan, a canal: Panama"

Output:
true

Explanation:
- The string "A man, a plan, a canal: Panama" is a valid palindrome after ignoring non-alphanumeric characters and considering case-insensitive comparison.

Note:
- You may assume the string contains only printable ASCII characters.
*/


public class Valid_Palindrome {

    public boolean isPalindrome(String s)
    {
        boolean ans = true;

        String newString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String newString2 = "";
        for (int i = newString.length()-1; i>-1; i--)
        {
            newString2 = newString2+newString.charAt(i);
        }

        if (newString.equals(newString2))
            ans = true;
        else
            ans = false;

        return ans;
    }

    public static void main(String args[])
    {
        Valid_Palindrome obj = new Valid_Palindrome();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));

    }
    
}
