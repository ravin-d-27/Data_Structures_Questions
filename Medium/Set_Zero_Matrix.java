/*
Problem Statement:

Given an 'm x n' matrix. If an element is 0, set its entire row and column to 0. Do it in-place.

Write a function 'setZeroes' that takes a 2D integer array 'matrix' and modifies it in-place.

Function Signature: 
    public void setZeroes(int[][] matrix)

Input:
- An 'm x n' 2D integer array 'matrix' (1 <= m, n <= 200). The elements of the matrix will be integers in the range [-1000, 1000].

Output:
- Modify the input matrix in-place.

Example:

Input:
matrix = [[1,1,1],[1,0,1],[1,1,1]]

Output:
matrix = [[1,0,1],[0,0,0],[1,0,1]]

Explanation:
- After setting the entire row and column of the element (1,1) to zero, we get the output matrix.

Note:
- You must do it in-place. Please do not allocate extra space for another matrix. You must modify the input matrix and do not return anything from your function.
*/


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
