/*
Problem Statement:

You are given two strings, s and t. You need to determine if they are valid anagrams of each other.

Write a program to check if s and t are valid anagrams.

Write a function 'isAnagram' that takes two strings 's' and 't' and returns true if they are valid anagrams, false otherwise.

Function Signature: 
    public boolean isAnagram(String s, String t)

Input:
- Two strings 's' and 't' (1 <= |s|, |t| <= 5 * 10^4) consisting of lowercase English letters.

Output:
- A boolean value representing whether 's' and 't' are valid anagrams or not.

Example:

Input:
s = "anagram"
t = "nagaram"

Output:
true

Explanation:
- The two strings "anagram" and "nagaram" are anagrams of each other.

Note:
- You may assume the string contains only lowercase English letters.
*/


import java.util.*;
public class Valid_Anagrams
{
    static int count(String x, char y)
    {   
        int c = 0;
        for (int i = 0; i<x.length(); i++)
        {
            if (x.charAt(i) == y)
            {
                c++;
            }
        }

        return c;
    }
    public boolean isAnagram(String s, String t)
    {
        boolean ans = true;
        String[] s_elements = s.split("");
        String[] t_elements = t.split("");
        Set <String> s_set = new HashSet<>(Arrays.asList(s_elements));
        Set <String> t_set = new HashSet<>(Arrays.asList(t_elements));

        s_set.addAll(t_set);
        
        for (String i: s_set)
        {
            int T = count(t, i.charAt(0));
            int S = count(s,i.charAt(0));
            if (T==S)
            {
                ans = true;
            }
            else
            {
                ans = false;
                break;
            }
        }


        return ans;
    }

    public static void main(String args[])
    {
        Valid_Anagrams obj = new Valid_Anagrams();
        System.out.println(obj.isAnagram("a", "ab"));
    }
}