package mypractice;

class Diagonal_Matrix {

    public static void main(String args[])
    {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };

        Diagonal_Matrix obj = new Diagonal_Matrix();
        System.out.println("The Diagonal Matrix is: ");
        obj.printDiagonal(matrix);
    }

    public void printDiagonal(int[][] matrix)
    {
        for (int i = 0; i<matrix.length; i++)
        {
            for (int j = 0; j<matrix[0].length; j++)
            {
                if (i==j)
                {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    
}
