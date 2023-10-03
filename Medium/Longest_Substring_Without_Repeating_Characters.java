/*
Problem Statement:

Given a string 's', find the length of the longest substring without repeating characters.

Write a function 'lengthOfLongestSubstring' that takes a string 's' and returns the length of the longest substring without repeating characters.

Function Signature: 
    public int lengthOfLongestSubstring(String s)

Input:
- A string 's' (1 <= |s| <= 10^5) where |s| represents the length of the string. 's' consists of only printable ASCII characters.

Output:
- An integer representing the length of the longest substring without repeating characters.

Example:

Input:
s = "pkkwew"

Output:
3

Explanation:
The longest substring without repeating characters is "kwe" with length 3.

Note:
- Your solution should have linear runtime complexity.
*/


public class Longest_Substring_Without_Repeating_Characters 
{
    static void display(int [] arr)
    {
        for (int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[256]; // Assuming ASCII characters
    
        int ans = 0, i = 0;
    
        for (int j = 0; j < s.length(); j++) {
            i = Math.max(lastIndex[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            lastIndex[s.charAt(j)] = j + 1;
            display(lastIndex);
            System.out.println("\n\n");
        }

        
    
        return ans;
    }
    

    public static void main(String args[])
    {
        Longest_Substring_Without_Repeating_Characters obj = new Longest_Substring_Without_Repeating_Characters();
        System.out.println(obj.lengthOfLongestSubstring("pkkwew"));
    }
    
}
