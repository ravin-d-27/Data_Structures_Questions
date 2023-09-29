public class Remove_Consecutive_Characters
{
    public String removeConsecutiveCharacter(String S){
        
        S+=" ";
        String newString = "";
        for (int i = 1; i<S.length(); i++)
        {
            if (S.charAt(i-1)!=S.charAt(i))
            {
                newString+=S.charAt(i-1);
            }
        }
        
        return newString;
        
    }

    public static void main(String args[])
    {
        Remove_Consecutive_Characters obj = new Remove_Consecutive_Characters();
        System.out.println(obj.removeConsecutiveCharacter("aabb"));
    }
}