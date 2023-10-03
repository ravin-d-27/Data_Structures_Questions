import java.util.*;
public class Set_Zero_Matrix {

    public void setZeroes(int[][] matrix)
    {
        int m = matrix.length;
        int n = matrix[0].length;

        Set <Integer> zeroRows = new HashSet<>();
        Set <Integer> zeroCols = new HashSet<>();

        for (int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                if (matrix[i][j]==0)
                {
                    zeroRows.add(i);
                    zeroCols.add(j);
                }
            }
        }

        
        for (int i = 0; i<m; i++)
        {
            for (int j = 0; j<n; j++)
            {
                if (zeroCols.contains(i) || zeroRows.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }


    }
    
}
