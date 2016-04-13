/*
    https://leetcode.com/problems/minimum-depth-of-binary-tree/

    Given a binary tree, find its minimum depth.

    The minimum depth is the number of nodes along the shortest path from the 
    root node down to the nearest leaf node.

    @tags: Tree, Depth-first Search, Breadth-first Search
*/

public class P111_MinDepthOfBT{
	public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else if(root.left==null&&root.right!=null){
            return 1+minDepth(root.right);
        }else if(root.left!=null&&root.right==null){
            return 1+minDepth(root.left);
        }else{
            return Math.min(minDepth(root.right),minDepth(root.left))+1;   
        }
    }
}
