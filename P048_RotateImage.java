
public class P048_RotateImage{
	public void rotate(int[][] matrix) {
        int N = matrix.length;
    	for(int i=0;i<N/2;i++){
    		for(int j=0;j<N-1-i*2;j++){
    			int tmp = matrix[i][i+j];//left-top
    			matrix[i][i+j] = matrix[N-1-(i+j)][i];//left-bottom ->left-top
    			matrix[N-1-(i+j)][i] = matrix[N-1-i][N-1-(i+j)];//right-bottom->left-bottom
    			matrix[N-1-i][N-1-(i+j)] = matrix[i+j][N-1-i];
    			matrix[i+j][N-1-i] = tmp;
    		}
    	}
    }
}
