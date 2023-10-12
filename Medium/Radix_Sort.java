public class Radix_Sort {

    private static int maxValue(int arr[])
    {
        int max = 0;
        for (int i = 0; i<arr.length; i++)
        {
            if (max<arr[i])
            {
                max = arr[i];
            }
        }

        return max;
    }

    private void countingSort(int arr[], int digit)
    {
        int max = maxValue(arr);
        int countArray[] = new int[max+1];

        // Initialize the array with Zero
        for (int i = 0; i<countArray.length; i++)
        {
            countArray[i] = 0;
        }

        // Frequency
        for (int i = 0; i<arr.length; i++)
        {
            countArray[(arr[i]/digit)%10]++;
        }

        // Finding the Cumulative Sum

        for (int i = 1; i<countArray.length; i++)
        {
            countArray[i] += countArray[i-1];
        }

        // Define output Array

        int output[] = new int[arr.length];

        for (int i = arr.length-1; i>=0; i--)
        {
            output[countArray[(arr[i]/digit)%10]-1] = arr[i];
            countArray[(arr[i]/digit)%10]--;
        }

        for (int i = 0; i<output.length; i++)
        {
            arr[i] = output[i];
        }

    }

    public void radixSort(int arr[])
    {
        int max = maxValue(arr);
        for (int digit = 1; max/digit>0; digit*=10)
        {
            countingSort(arr, digit);
        }
    }


    public static void main(String args[])
    {
        int arr[] = { 170, 45, 75, 90, 802, 24, 2, 66 }; 
        Radix_Sort obj = new Radix_Sort();
        obj.radixSort(arr);

        for (int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    
}
