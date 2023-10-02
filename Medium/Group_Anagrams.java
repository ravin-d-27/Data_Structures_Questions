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
