public class Valid_Palindrome {

    public boolean isPalindrome(String s)
    {
        boolean ans = true;

        String newString = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

        String newString2 = "";
        for (int i = newString.length()-1; i>-1; i--)
        {
            newString2 = newString2+newString.charAt(i);
        }

        if (newString.equals(newString2))
            ans = true;
        else
            ans = false;

        return ans;
    }

    public static void main(String args[])
    {
        Valid_Palindrome obj = new Valid_Palindrome();
        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));

    }
    
}
