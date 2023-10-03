import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        
            // [1,2,3] top = 0, bottom = 2
            // [4,5,6] left = 0, right = 2
            // [7,8,9]

        while (top <= bottom && left <= right) 
        {
            // Traverse top row
            for (int j = left; j <= right; j++) 
            {
                ans.add(matrix[top][j]);
            }
            
            top++;

            // Traverse rightmost column

            for (int i = top; i <= bottom; i++) 
            {
                ans.add(matrix[i][right]);
            }

            right--;

            // Check if there's still a row to traverse
            if (top <= bottom) 
            {
                // Traverse bottom row
                for (int j = right; j >= left; j--) 
                {
                    ans.add(matrix[bottom][j]);
                }
                
                bottom--;
            }

            // Check if there's still a column to traverse
            if (left <= right) 
            {
                // Traverse leftmost column
                for (int i = bottom; i >= top; i--) 
                {
                    ans.add(matrix[i][left]);
                }
                
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        Spiral_Matrix spiralMatrix = new Spiral_Matrix();
        List<Integer> result = spiralMatrix.spiralOrder(matrix);

        System.out.println(result); // Output: [1, 2, 3, 6, 9, 8, 7, 4, 5]
    }
}
