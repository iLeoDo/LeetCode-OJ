/*
    https://leetcode.com/problems/rotate-image/

    You are given an n x n 2D matrix representing an image.

    Rotate the image by 90 degrees (clockwise).

    Follow up:
    Could you do this in-place?

    @tags: Array
*/

public class P048_RotateImage{
    public void rotate(int[][] matrix) {
        int length = matrix.length;

        for(int i=0;i<length/2;i++){
            for(int j=i;j<length-i-1;j++){
                int rotate = matrix[i][j];
                matrix[i][j]=matrix[length-1-j][i];
                matrix[length-1-j][i] = matrix[length-1-i][length-1-j];
                matrix[length-1-i][length-1-j] = matrix[j][length-1-i];
                matrix[j][length-1-i] = rotate;
            }
        }
    }
}
