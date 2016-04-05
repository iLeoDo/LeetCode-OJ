
public class P054_SpiralMatrix{
	public List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        if(matrix.length==0){
            return list;
        }

        int M = matrix.length;
        int N = matrix[0].length;

        int layer=0;

        for(;layer<(Math.min(N/2,M/2));layer++){

            for(int i=0;i<(N-1-2*layer);i++){ // up
                list.add(matrix[layer][i+layer]);
            }
            for(int i=0;i<(M-1-2*layer);i++){ // right
                list.add(matrix[i+layer][N-1-layer]);
            }
            for(int i=0;i<(N-1-2*layer);i++){ // bottom
                list.add(matrix[M-1-layer][N-1-layer-i]);
            }
            for(int i=0;i<(M-1-2*layer);i++){ // left
                list.add(matrix[M-1-layer-i][layer]);
            }
        }

        if(N>M  && M%2==1){ // vertical odd,
            for(int i=0;i<=(N-1-2*layer);i++){
                list.add(matrix[M/2][layer+i]);
            }
        }else if(M>N && N%2==1){ // horizontal odd,
            for(int i=0;i<=(M-1-2*layer);i++){
                list.add(matrix[layer+i][N/2]);
            }
        }else if(M==N && N%2==1){
            list.add(matrix[M/2][N/2]); // not necessary
        }

        return list;

    }
}
