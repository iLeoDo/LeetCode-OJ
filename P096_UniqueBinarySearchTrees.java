
public class P096_UniqueBinarySearchTrees{
    public int numTrees(int n) {
        int[] table = new int[n+1];
        table[0] = 1;
        table[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int root=1;root<=i;root++){
                int left = table[root-1];
                int right = table[i-root];
                table[i]+=(left*right);
            }
        }
        return table[n];
    }
}
