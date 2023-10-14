public class Product_of_Array_except_itself_optimized {

    public int[] findProductsOptimized(int arr[])
    {
        int temp[] = new int[arr.length];
        int prod = 1;
        int zero = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i]!=0)
            {
                prod*=arr[i];
            }
            else
            {
                zero++;
            }
                
        }

        for (int i = 0; i<temp.length; i++)
        {
            if (zero==1 && arr[i]==0)
            {
                temp[i] = prod;
            }
            else if(zero==0)
            {
                temp[i] = prod/arr[i];
            }
            else
            {
                temp[i] = 0;
            }
        }

        return temp;
    }

    public static void main(String args[])
    {
        Product_of_Array_except_itself_optimized obj = new Product_of_Array_except_itself_optimized();
        int arr[] = {1, 2, 3, 4, 5};

        int temp[] = obj.findProductsOptimized(arr);
        for (int i = 0; i<temp.length; i++)
        {
            System.out.println(temp[i]);
        }
    }
    
}
