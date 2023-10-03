/*
Problem Statement:

Given a string 's', find the longest palindromic substring in 's'. You may assume that the maximum length of 's' is 1000.

A palindrome is a word, phrase, or other sequence of characters that reads the same backward as forward. For example, "madam" and "racecar" are palindromes.

Write a function 'longestPalindrome' that takes a string 's' and returns the longest palindromic substring.

Function Signature: 
    public String longestPalindrome(String s)

Input:
- A string 's' (1 <= |s| <= 1000) where |s| represents the length of the string. 's' consists of only lowercase and/or uppercase English letters.

Output:
- A string representing the longest palindromic substring.

Example:

Input:
s = "ababc"

Output:
"bab"

Explanation:
The longest palindromic substring in "ababc" is "bab".

Note:
- Your solution should have linear runtime complexity.
- You may assume that there is only one longest palindromic substring.
*/


public class Longest_Palindromic_String {

        static boolean isPalindrome(String s) {
            StringBuilder str = new StringBuilder(s).reverse();
            return str.toString().equals(s);
        }
    
        public String longestPalindrome(String s) {
    
            int max_len = 0;
            String ans = "";
    
            for (int i = 0; i < s.length(); i++) {
                String temp = "";
                temp += s.charAt(i);
                boolean isp = isPalindrome(temp);
    
                if (isp) {
                    if (max_len < temp.length()) {
                        max_len = Math.max(max_len, temp.length());
                        ans = temp;
                    }
                }
    
                for (int j = i + 1; j < s.length(); j++) {
                    temp += s.charAt(j);
                    isp = isPalindrome(temp);
    
                    if (isp) {
                        if (max_len < temp.length()) {
                            max_len = Math.max(max_len, temp.length());
                            ans = temp;
                        }
                    }
                }
            }
    
            return ans;
        }
    
    

    public static void main(String args[])
    {
        Longest_Palindromic_String obj = new Longest_Palindromic_String();
        System.out.println(obj.longestPalindrome("tscvrnsnnwjzkynzxwcltutcvvhdivtmcvwdiwnbmdyfdvdiseyxyiiurpnhuuufarbwalzysetxbaziuuywugfzzmhoessycogxgujmgvnncwacziyybryxjagesgcmqdryfbofwxhikuauulaqyiztkpgmelnoudvlobdsgharsdkzzuxouezcycsafvpmrzanrixubvojyeuhbcpkuuhkxdvldhdtpkdhpiejshrqpgsoslbkfyraqbmrwiykggdlkgvbvrficmiignctsxeqslhzonlfekxexpvnblrfatvetwasewpglimeqemdgdgmemvdsrzpgacpnrbmomngjpiklqgbbalzxiikacwwzbzapqmatqmexxqhssggsyzpnvvpmzngtljlrhrjbnxgpcjuokgxcbzxqhmitcxlzfehwfiwcmwfliedljghrvrahlcoiescsbupitckjfkrfhhfvdlweeeverrwfkujjdwtcwbbbbwctwdjjukfwrreveeewldvfhhfrkfjkctipubscseioclharvrhgjldeilfwmcwifwhefzlxctimhqxzbcxgkoujcpgxnbjrhrljltgnzmpvvnpzysggsshqxxemqtamqpazbzwwcakiixzlabbgqlkipjgnmombrnpcagpzrsdvmemgdgdmeqemilgpwesawtevtafrlbnvpxexkeflnozhlsqexstcngiimcifrvbvgkldggkyiwrmbqaryfkblsosgpqrhsjeiphdkptdhdlvdxkhuukpcbhueyjovbuxirnazrmpvfascyczeuoxuzzkdsrahgsdbolvduonlemgpktziyqaluuaukihxwfobfyrdqmcgsegajxyrbyyizcawcnnvgmjugxgocysseohmzzfguwyuuizabxtesyzlawbrafuuuhnpruiiyxyesidvdfydmbnwidwvcmtvidhvvctutlcwxznykzjwnnsnrvcst"));
    }
    
}
