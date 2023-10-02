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
