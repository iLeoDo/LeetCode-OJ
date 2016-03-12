
public class P101_SymmetricTree{

    /**
     * Iteratively
     */
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null){
            return true;
        }
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode left = queue.poll(),
                    right = queue.poll();
            if(left==null&&right==null) continue;
            if(left==null ^ right==null) return false;
            if(left.val!=right.val) return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

    /**
     * Recursive
     */
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root==null){
            return true;
        }
        return isSymmetricHelper(root.left,root.right);
    }

    private boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null ^ right==null) return false;
        return (left.val==right.val)&&isSymmetricHelper(left.left, right.right)&&isSymmetricHelper(left.right, right.left);
    }
}
