/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class P107_BTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> layer = new LinkedList<TreeNode>();
        if(root==null){
            return result;
        }
        layer.offer(root);
        while(!layer.isEmpty()){
            int num = layer.size();
            
            List<Integer> subList = new LinkedList<Integer>();
            
            for(int i = 0;i<num;i++){
                TreeNode current = layer.poll();
                subList.add(current.val);
                if(current.left!=null){
                    layer.offer(current.left);
                }
                if(current.right!=null){
                    layer.offer(current.right);
                }
            }
            result.addFirst(subList);
            
        }
        return result;
    }
}
