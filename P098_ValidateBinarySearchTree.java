
public class P098_ValidateBinarySearchTree{

    /**
     * Iteratively
     */
    public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode current = root;
        Integer max = null; // or use Long to avoid the Integer.MIN_VALUE in the tree
        while(current!=null||!stack.empty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            // core start
            if(max==null||current.val>max){
                max = current.val;
            }else{
                return false;
            }
            // core end
            current = current.right;
        }
        return true;
    }

    /**
     * Recursive
     */
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val >= maxVal || root.val <= minVal) return false;
        return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
    }
}
