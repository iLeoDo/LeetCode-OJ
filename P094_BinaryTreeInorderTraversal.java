/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class P094_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> traversal = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        while(current!=null||!stack.empty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            traversal.add(current.val);
            current = current.right;
        }
        return traversal;
    }
}
