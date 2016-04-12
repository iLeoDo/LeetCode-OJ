/*
    https://leetcode.com/problems/balanced-binary-tree/

    Given a binary tree, determine if it is height-balanced.

    For this problem, a height-balanced binary tree is defined as a binary tree 
    in which the depth of the two subtrees of every node never differ by more 
    than 1.

    @tags: Tree, Depth-first Search
*/

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
