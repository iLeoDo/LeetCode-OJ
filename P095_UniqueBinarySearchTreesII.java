
public class P095_UniqueBinarySearchTreesII{

    /**
     * DP
     */
    public List<TreeNode> generateTrees(int n) {
        // a dummy list hold trees on n=0
        List<TreeNode>[] structures = new List[n+1];
        structures[0] = new ArrayList<TreeNode>();
        if(n==0){
            return structures[0];
        }
        structures[0].add(null);

        // DP: fill the table, structures[i] is the tree structures for n=i
        for(int i=1;i<=n;i++){
            structures[i] = new ArrayList<TreeNode>();
            // DP: select root
            for(int r=1;r<=i;r++){
                for(TreeNode left : structures[r-1]){
                    for(TreeNode right : structures[i-r]){
                        TreeNode root = new TreeNode(r);
                        root.left = left;
                        root.right = fillStructure(right,r);
                        structures[i].add(root);
                    }
                }
            }

        }
        return structures[n];

    }

    // fill the structure with a offset
    private TreeNode fillStructure(TreeNode root, int offset){
         if(root==null){
             return null;
         }
         TreeNode newRoot = new TreeNode(root.val+offset);
         newRoot.left = fillStructure(root.left,offset);
         newRoot.right= fillStructure(root.right,offset);
         return newRoot;
    }


    /**
     * Recursive
     */
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<TreeNode>();
        }
        return generateTreesHelper(1,n);
    }

    private List<TreeNode> generateTreesHelper(int start, int end){
         List<TreeNode> trees = new ArrayList<TreeNode>();
         if(start>end){
             trees.add(null);
         }
         for(int i=start;i<=end;i++){
             List<TreeNode> leftTrees = generateTreesHelper(start,i-1);
             List<TreeNode> rightTrees = generateTreesHelper(i+1,end);
             for(TreeNode left : leftTrees){
                 for(TreeNode right : rightTrees){
                     TreeNode root = new TreeNode(i);
                     root.left = left;
                     root.right = right;
                     trees.add(root);
                 }
             }
         }
         return trees;
    }


}
