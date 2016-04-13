/*
    Given a m x n matrix, if an element is 0, set its entire row and column
    to 0. Do it in place.


    Follow up:
    Did you use extra space?
    A straight forward solution using O(mn) space is probably a bad idea.
    A simple improvement uses O(m + n) space, but still not the best solution.
    Could you devise a constant space solution?

    @tags: Array
 */
public class P073_SetMatrixZeros{
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // check first col
        boolean firstColZero = false;
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstColZero = true;
                break;
            }
        }

        // check first row
        boolean firstRowZero = false;
        for(int i=0;i<n;i++){
            if(matrix[0][i]==0){
                firstRowZero = true;
                break;
            }
        }

        // check left
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        //check flags in first col
        for(int i=1;i<m;i++){
            if(matrix[i][0]==0){
                for(int j=1;j<n;j++){
                    matrix[i][j]=0;
                }
            }else if(firstColZero){
                matrix[i][0]=0;
            }
        }

        //check flags in first row
        for(int i=1;i<n;i++){
            if(matrix[0][i]==0){
                for(int j=1;j<m;j++){
                    matrix[j][i]=0;
                }
            }else if(firstRowZero){
                matrix[0][i]=0;
            }
        }

        //left-top
        if(firstRowZero||firstColZero){
            matrix[0][0]=0;
        }
    }
}
