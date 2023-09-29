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
