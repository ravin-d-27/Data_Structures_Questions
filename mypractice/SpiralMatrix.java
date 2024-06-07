package mypractice;

public class SpiralMatrix {

    public static void main(String args[])
    {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };

        SpiralMatrix obj = new SpiralMatrix();
        System.out.println("The Spiral Matrix is: ");
        obj.printSpiralMatrix(matrix);
    }
    
    
    public void printSpiralMatrix(int[][] matrix)
    {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol <= endCol)
        {
            // Traversing the Top:

            for (int i = startCol; i<=endCol; i++)
            {
                System.out.print(matrix[startRow][i] + " ");
            }

            // Traversing the Right:

            for (int i = startRow; i<=endRow; i++)
            {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Traversing the Bottom:

            for (int i = endCol; i>=startCol; i--)
            {
                System.out.print(matrix[endRow][i] + " ");
            }

            // Traversing the Left:

            for (int i = endRow; i>=startRow; i--)
            {
                System.out.println(matrix[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
    }
}
