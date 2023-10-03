public class Palindromic_Substrings {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            count += countPalindromesAroundCenter(s, i, i); // For odd length palindromes
            count += countPalindromesAroundCenter(s, i, i + 1); // For even length palindromes
        }

        return count;
    }

    private int countPalindromesAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public static void main(String args[]) {
        Palindromic_Substrings obj = new Palindromic_Substrings();
        System.out.println(obj.countSubstrings("fdsklf"));
    }
}
