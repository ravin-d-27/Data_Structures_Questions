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
