
public class P104_MaximumDepthOfBinaryTree{
    /**
     * Iteratively : DFS
     */
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> depths = new Stack<Integer>();
        if(root==null){
            return maxDepth;
        }
        stack.push(root);
        depths.push(1);

        while(!stack.empty()){
            TreeNode top = stack.pop();
            int topDepth = depths.pop();

            maxDepth = Math.max(maxDepth,topDepth);
            if(top.left!=null){
                stack.push(top.left);
                depths.push(topDepth+1);
            }

            if(top.right!=null){
                stack.push(top.right);
                depths.push(topDepth+1);
            }

        }
        return maxDepth;

    }

    /**
     * Recursive
     */
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else{
            return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
        }
    }
}
