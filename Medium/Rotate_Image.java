/*
Problem Statement:

You are given an 'n x n' 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Write a function 'rotate' that takes a 2D integer array 'matrix' and rotates it 90 degrees clockwise.

Function Signature: 
    public void rotate(int[][] matrix)

Input:
- An 'n x n' 2D integer array 'matrix' (1 <= n <= 20). The elements of the matrix will be distinct integers in the range [-1000, 1000].

Output:
- Rotate the input matrix in-place.

Example:

Input:
matrix = [[1,2,3],[4,5,6],[7,8,9]]

Output:
matrix = [[7,4,1],[8,5,2],[9,6,3]]

Explanation:
After rotating the input matrix by 90 degrees clockwise, we get the output matrix.

Note:
- You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
*/



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
