/*
    https://leetcode.com/problems/binary-tree-level-order-traversal-ii/

    Given a binary tree, return the bottom-up level order traversal of its 
    nodes' values. (ie, from left to right, level by level from leaf to root).

    For example:
    Given binary tree {3,9,20,#,#,15,7},
        3
       / \
      9  20
        /  \
       15   7
    return its bottom-up level order traversal as:
    [
      [15,7],
      [9,20],
      [3]
    ]

    @tags: Tree, Breadth-first Search
*/

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class P107_BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> traversal = new LinkedList();
        Queue<TreeNode> layer = new LinkedList();
        if(root != null){
            layer.offer(root);
        }

        while(!layer.isEmpty()){
            int size = layer.size();
            List<Integer> level = new LinkedList();
            for(int i=0; i<size; i++){
                TreeNode t = layer.poll();
                level.add(t.val);
                if(t.left!=null){
                    layer.offer(t.left);
                }
                if(t.right!=null){
                    layer.offer(t.right);
                }
            }
            traversal.add(0,level);
        }
        return traversal;
    }
}
