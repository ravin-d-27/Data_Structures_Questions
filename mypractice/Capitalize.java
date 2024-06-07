package mypractice;

public class Capitalize {

    public static void main(String args[])
    {
        String sentence = "never give up";
        StringBuilder answer = new StringBuilder("");
        char ch = Character.toUpperCase(sentence.charAt(0));

        answer.append(ch);

        for (int i = 1; i<sentence.length(); i++)
        {
            if (sentence.charAt(i-1)==' ')
            {
                char temp = Character.toUpperCase(sentence.charAt(i));
                answer.append(temp);
            }
            else
            {
                answer.append(sentence.charAt(i));
            }
        }

        System.out.println("Capitalized: "+answer);
        
    }
    
}
