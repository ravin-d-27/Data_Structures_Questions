/*
Problem Statement:

Given a string 's', find the longest palindromic substring in 's'. You may assume that the maximum length of 's' is 1000.

A palindrome is a word, phrase, or other sequence of characters that reads the same backward as forward. For example, "madam" and "racecar" are palindromes.

Write a function 'longestPalindrome' that takes a string 's' and returns the longest palindromic substring.

Function Signature: 
    public String longestPalindrome(String s)

Input:
- A string 's' (1 <= |s| <= 1000) where |s| represents the length of the string. 's' consists of only lowercase and/or uppercase English letters.

Output:
- A string representing the longest palindromic substring.

Example:

Input:
s = "ababc"

Output:
"bab"

Explanation:
The longest palindromic substring in "ababc" is "bab".

Note:
- Your solution should have linear runtime complexity.
- You may assume that there is only one longest palindromic substring.
*/



public class Longest_Palindromic_String_Optimized {
    public String longestPalindrome(String s)
    {
        String ans = "";
        int max_len = 0;

        for (int i = 0; i<s.length(); i++)
        {
            int left = i;
            int right = i;

            while (left>=0 && right<s.length() && s.charAt(right)==s.charAt(left))
            {
                if (right-left+1 > max_len)
                {
                    ans = s.substring(left, right+1);
                    max_len = right-left+1;
                }

                left--;
                right++;
            }

            left = i;
            right = i+1;
            while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                if (right-left+1 > max_len)
                {
                    ans = s.substring(left, right+1);
                    max_len = right-left+1;
                }

                left--;
                right++;
            }

        }

        return ans;
    }

    public static void main(String argsString[])
    {
        Longest_Palindromic_String_Optimized obj = new Longest_Palindromic_String_Optimized();
        System.out.println(obj.longestPalindrome("ababc"));
    }

}
