/*
Problem Statement:

Given an array of strings 'strs', group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Write a function 'groupAnagrams' that takes an array of strings 'strs' and returns a list of lists, where each list contains anagrams grouped together.

Function Signature: 
    public List<List<String>> groupAnagrams(String[] strs)

Input:
- An array of strings 'strs' (1 <= strs.length <= 10^4), where each string 'strs[i]' consists of lowercase English letters. The length of 'strs[i]' will be at most 100.

Output:
- A list of lists, where each inner list contains anagrams grouped together.

Example:

Input:
strs = ["eat","tea","tan","ate","nat","bat"]

Output:
[
  ["bat"],
  ["nat","tan"],
  ["ate","eat","tea"]
]

Explanation:
- The groups are "bat", "nat" and "tan" are anagrams of each other, and "ate", "eat", and "tea" are anagrams of each other.

Note:
- All inputs will be in lowercase.
- The order of your output does not matter.
*/



import java.util.*;

public class Group_Anagrams {

    static HashMap<Character,Integer> addElements(String s)
    {
        HashMap <Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) 
        {
                c = Character.toLowerCase(c);
                map.put(c, map.getOrDefault(c, 0) + 1);
        }

        return map;
    }
        
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // strs = ["eat","tea","tan","ate","nat","bat"]

        List<HashMap<Character, Integer>> listOfMaps = new ArrayList<>();

        for (String str : strs)
        {
            listOfMaps.add(addElements(str));   
        }
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[listOfMaps.size()];

        for (int i = 0; i<listOfMaps.size(); i++)
        {

            if (!visited[i])
            {
                List<String> group = new ArrayList<>();
                group.add(strs[i]);
                visited[i] = true;
            
                for (int j = i+1; j<listOfMaps.size(); j++)
                {
                    if (!visited[j] && listOfMaps.get(i).equals(listOfMaps.get(j)))
                    {
                        group.add(strs[j]);
                        visited[j] = true;
                    }
                }

                ans.add(group);
            }
         }
        
         return ans;
        
    }

    public static void main(String args[])
    {
        Group_Anagrams ga = new Group_Anagrams();
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(ga.groupAnagrams(strs1));
    }
}
