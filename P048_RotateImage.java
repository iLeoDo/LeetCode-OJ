
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
