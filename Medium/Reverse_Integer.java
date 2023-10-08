public class Reverse_Integer
{
    public int reverse(int x)
    {
        int ans = 0;
        int num;

        if (x>=-2147483648 || x<=2147483647)
        {
            num = 0;
        }
        else
        {
            return 0;
        }
        
        

        if (x<0)
        {
            num = 0-x;
        }
        else
        {
            num = 0+x;
        }

        if (String.valueOf(num).length()>9)
        {
            return 0;
        }

        while (num!=0)
        {
            int n = num%10;
            ans=ans*10+n;
            num/=10;
        } 

        if (x<0)
        {
            ans = 0-ans;
        }
        else
        {
            ans = 0+ans;
        }

        return ans;
    }

    public static void main(String args[])
    {
        Reverse_Integer obj = new Reverse_Integer();
        System.out.println(obj.reverse(-2147483412));
    }
}