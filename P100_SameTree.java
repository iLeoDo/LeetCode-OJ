
public class P100_SameTree{
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(p);
        queue.add(q);
        while(!queue.isEmpty()){
            TreeNode tq = queue.poll(),
                    tp  = queue.poll();
            if(tq ==null && tp ==null) continue;
            if(tq == null ^ tp ==null) return false;
            if(tq.val!=tp.val) return false;
            queue.add(tq.left);
            queue.add(tp.left);
            queue.add(tq.right);
            queue.add(tp.right);
        }
        return true;
    }
}
