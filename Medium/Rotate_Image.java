import java.util.*;

public class Rotate_Image 
{

    public void rotate(int[][] matrix) 
    {
        int m = matrix.length;
        int n = matrix[0].length;

        // [1,2,3]
        // [4,5,6]
        // [7,8,9]
        int k = 0;

        List <Integer> arr = new ArrayList<>();

        for (k = 0; k<n; k++)
        {
            for (int i = m-1; i>=0; i--)
            {
                arr.add(matrix[i][k]);
            }
        }

        System.out.println(arr);
        k = 0;
        for (int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                matrix[i][j] = arr.get(k);
                k++;
            }
        }
        
    }

    public static void main(String args[])
    {
        Rotate_Image obj = new Rotate_Image();
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        obj.rotate(arr);
    }
    
}
