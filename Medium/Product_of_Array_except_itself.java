public class Product_of_Array_except_itself
{
    public int[] findProducts(int arr[])
    {
        int temp[] = new int[arr.length];

        for (int i = 0; i<temp.length; i++)
        {
            temp[i] = 1;
        }

        for (int i = 0; i<arr.length; i++)
        {
            int right = i+1;
            int left = i-1;

            while (left>=0 && right<arr.length)
            {
                temp[i] = temp[i]*arr[right]*arr[left];

                right++;
                left--;
            }

            if (left<0)
            {
                while (right<arr.length)
                {
                    temp[i] *= arr[right];
                    right++;
                }
            }

            if (right>=arr.length)
            {
                while (left>=0)
                
                {
                    temp[i] *= arr[left]; 
                    left--;  
                }
                
            }
        }

        return temp;

    }

    public static void main(String args[])
    {
        Product_of_Array_except_itself obj = new Product_of_Array_except_itself();
        int arr[] = {1, 2, 3, 4, 5};

        int temp[] = obj.findProducts(arr);
        for (int i = 0; i<temp.length; i++)
        {
            System.out.println(temp[i]);
        }
    }
}