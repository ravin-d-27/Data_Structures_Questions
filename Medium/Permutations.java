/**
 * Problem Statement: Permutations of a String
 *
 * You are given a string 'str'. Write a Java program to find and print all permutations of the characters in the string.
 *
 * Implement the following:
 *
 * 1. Create a class named 'Permutations'.
 * 2. Inside the class, implement a method named 'printPermutations' with the following signature:
 *    /**
 *     * Generates and prints permutations of a string.
 *     *
 *     * @param str   The original string from which permutations are generated.
 *     * @param perm  The current permutation being constructed.
 *     * @param index The current index of the permutation.
 *     * /
 *    public void printPermutations(String str, String perm, int index)
 *
 *    The method should print each permutation as it is generated.
 *
 * 3. In the 'printPermutations' method:
 *    - If the length of the input string 'str' is 0, print the current permutation 'perm'.
 *    - Otherwise, recursively generate permutations by iterating over each character in the input string:
 *      - Extract the character at index 'i'.
 *      - Create a new string 'newStr' by removing the character at index 'i'.
 *      - Recursively call 'printPermutations' with the updated 'newStr',
 *        the current permutation 'perm' concatenated with 'currChar', and the incremented 'index'.
 *
 * 4. In the 'main' method:
 *    - Create an instance of the 'Permutations' class.
 *    - Define a string 'str'.
 *    - Call the 'printPermutations' method with the initial permutation as an empty string,
 *      starting index as 0, and the input string 'str'.
 *
 * Example Usage:
 *
 * public class Permutations {
 *
 *     public void printPermutations(String str, String perm, int index)
 *     {
 *         // Implementation of the method
 *     }
 *
 *     public static void main(String args[])
 *     {
 *         Permutations obj = new Permutations();
 *         String str = "ABC";
 *         obj.printPermutations(str, "", 0);
 *     }
 * }
 *
 * When the program is executed with 'str = "ABC"', it should generate and print all possible
 * permutations of the characters in the string "ABC".
 */




import java.util.*;

public class Permutations {
    
    static List <String> lst = new ArrayList<>();

    public static void printPermutations(String str, String perm, int index)
    {
        if (str.length()==0)
        {
            lst.add(perm);
            return;        
        }

        for (int i = 0; i<str.length(); i++)
        {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPermutations(newStr, currChar+perm, index+1);
        }
    }

    public static void main(String args[]) {
        String str = "ABC";
        printPermutations(str, "", 0);

        System.out.println(lst);
    }
}
