public class Longest_Repeating_Character_Replacement {

    public int characterReplacement(String s, int k) {
    int[] arr = new int[26];
    int max_len = 0;
    int max_rep = 0;

    int i = 0;

    for (int j = 0; j < s.length(); j++) {
        arr[s.charAt(j) - 'A']++;
        max_rep = Math.max(max_rep, arr[s.charAt(j) - 'A']); // Updated this line
        int window_size = j - i + 1;
        while (window_size - max_rep > k) {
            arr[s.charAt(i) - 'A']--;
            i++;
            window_size = j - i + 1;
        }

        max_len = Math.max(max_len, window_size);
    }

    return max_len;
}

    
    
    public static void main(String args[])
    {
        Longest_Repeating_Character_Replacement obj = new Longest_Repeating_Character_Replacement();
        System.out.println(obj.characterReplacement("AABABBA", 1));
    }
}
