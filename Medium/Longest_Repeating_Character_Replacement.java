/*
Problem Statement:

Given a string 's' that consists of only uppercase English letters, you can perform at most 'k' operations on that string.

In one operation, you can choose any character of the string and change it to any other uppercase English character.

Find the length of the longest substring containing all repeating letters you can get after performing the above operations.

Write a function 'characterReplacement' that takes a string 's' and an integer 'k' and returns the maximum length of substring with all repeating characters.

Function Signature: 
    public int characterReplacement(String s, int k)

Input:
- A string 's' (1 <= |s| <= 10^5) consisting of only uppercase English letters.
- An integer 'k' (0 <= k <= 10^4) representing the maximum number of operations allowed.

Output:
- An integer representing the maximum length of substring with all repeating characters that can be obtained.

Example:

Input:
s = "AABABBA", k = 1

Output:
4

Explanation:
After performing at most 1 operation, we can get "AAABBBB", so the longest substring is "BBBB" with length 4.

Note:
- Both the input string and k will be in the range [0, 10^4].
*/




public class Longest_Repeating_Character_Replacement {

    public int characterReplacement(String s, int k) {
    int[] arr = new int[26];
    int max_len = 0;
    int max_rep = 0;

    int i = 0;

    for (int j = 0; j < s.length(); j++) {
        arr[s.charAt(j) - 'A']++;
        max_rep = Math.max(max_rep, arr[s.charAt(j) - 'A']); // Updated this line
        int window_size = j - i + 1;
        while (window_size - max_rep > k) {
            arr[s.charAt(i) - 'A']--;
            i++;
            window_size = j - i + 1;
        }

        max_len = Math.max(max_len, window_size);
    }

    return max_len;
}

    
    
    public static void main(String args[])
    {
        Longest_Repeating_Character_Replacement obj = new Longest_Repeating_Character_Replacement();
        System.out.println(obj.characterReplacement("AABABBA", 1));
    }
}
