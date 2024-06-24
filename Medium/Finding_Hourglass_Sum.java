import java.util.*;

public class Finding_Hourglass_Sum {
    
    static int hourglassSum(List<List<Integer>> arr)
    {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i<4; i++)
        {
            for (int j = 0; j<4; j++)
            {
                int sum = calcSum(arr,i,j);

                if (sum>maxSum)
                {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }

    static int calcSum(List<List<Integer>>arr, int row, int col)
    {
        int sum = arr.get(row).get(col) + arr.get(row).get(col+1)+arr.get(row).get(col+2)
                    +arr.get(row+1).get(col+1)
                    +arr.get(row+2).get(col)+arr.get(row+2).get(col+1)+arr.get(row+2).get(col+2);

        return sum;

    }
    public static void main(String args[])
    {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        arr.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        arr.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        arr.add(Arrays.asList(0, 0, 2, 4, 4, 0));
        arr.add(Arrays.asList(0, 0, 0, 2, 0, 0));
        arr.add(Arrays.asList(0, 0, 1, 2, 4, 0));

        System.out.println("Maximum hourglass sum: " + hourglassSum(arr));
    }
}
