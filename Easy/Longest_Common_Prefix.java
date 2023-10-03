/*
Problem Statement:

Write a program to find the longest common prefix string amongst an array of strings.

Write a function 'longestCommonPrefix' that takes a string array 'strs' and returns the longest common prefix string.

Function Signature: 
    public String longestCommonPrefix(String[] strs)

Input:
- A string array 'strs' (1 <= |strs| <= 200) where |strs| represents the number of strings. Each string 'strs[i]' (0 <= |strs[i]| <= 200) consists of only lowercase and uppercase English letters.

Output:
- A string representing the longest common prefix among the given strings.

Example:

Input:
strs = ["flower", "flow", "flight"]

Output:
"fl"

Explanation:
- The longest common prefix among the strings "flower", "flow", and "flight" is "fl".

Note:
- If there is no common prefix, return an empty string "".
*/



import java.util.*;
public class Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs) 
    {
        String ans = "";
        
        Arrays.sort(strs);
        
        String first = strs[0];
        String last = strs[strs.length-1];

        for (int i = 0; i<first.length(); i++)
        {
            if (first.charAt(i)==last.charAt(i))
            {
                ans+=first.charAt(i);
            }
            else
            {
                break;
            }
        }
        
        return ans;
    }

    public static void main(String args[])
    {
        Longest_Common_Prefix obj = new Longest_Common_Prefix();
        String[] str = {"flower", "flow", "flight"};
        System.out.println(obj.longestCommonPrefix(str));
    }
    
}
