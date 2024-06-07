package mypractice;

public class LargestByLexi {

    public static void main(String args[])
    {
        String fruits[] = {"apple", "banana", "orange"};
        String largest = fruits[0];
        for (int i = 1; i<fruits.length; i++)
        {
            if (largest.compareTo(fruits[i])<0)
            {
                largest=fruits[i];
            }
        }

        System.out.println("The Largest String Lexicographically is: "+largest);
    }
    
}
