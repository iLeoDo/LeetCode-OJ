/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class P145_BTreePostorderTraversal{
	public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> timeStack = new Stack<Integer>();
        
        TreeNode current = root;
        int time;
        while(current!=null||!stack.empty()){
            while(current!=null){
                stack.push(current);
                timeStack.push(1);
                current = current.left;
            }
            
            current = stack.pop();
            time =timeStack.pop();
            if(time==1){
                stack.push(current);
                timeStack.push(2);
                current = current.right;
            }else if(time==2){
                list.add(current.val);
                current = null;
            }
        }
        return list;
    }
}
