/*
Problem Statement:

Given a string 's', return the number of palindromic substrings in it.

A palindromic substring is a substring that reads the same backward as forward. A single character is considered a palindromic substring.

Write a function 'countSubstrings' that takes a string 's' and returns the number of palindromic substrings.

Function Signature: 
    public int countSubstrings(String s)

Input:
- A string 's' (1 <= |s| <= 1000) where |s| represents the length of the string. 's' consists of only printable ASCII characters.

Output:
- An integer representing the number of palindromic substrings in the given string.

Example:

Input:
s = "fdsklf"

Output:
5

Explanation:
The palindromic substrings are: "f", "d", "s", "k", "l".

Note:
- Your solution should have linear runtime complexity.
*/



public class Palindromic_Substrings {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += countPalindromesAroundCenter(s, i, i); // For odd length palindromes
            count += countPalindromesAroundCenter(s, i, i + 1); // For even length palindromes
        }

        return count;
    }

    private int countPalindromesAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String args[]) {
        Palindromic_Substrings obj = new Palindromic_Substrings();
        System.out.println(obj.countSubstrings("fdsklf"));
    }
}
