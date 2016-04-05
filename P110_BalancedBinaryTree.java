
public class P110_BalancedBinaryTree{
    public boolean isBalanced(TreeNode root) {
        return getHeight(root)!=-1;
    }

    public int getHeight(TreeNode root){
        if(root==null) return 0;
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        // if left or right is unbalanced
        if(left==-1 || right==-1){
            return -1;
        }
        // if this node is unbalanced
        if(left-right>1||right-left>1){
            return -1;
        }
        // balanced, return height.
        return Math.max(left,right)+1;
    }
}
