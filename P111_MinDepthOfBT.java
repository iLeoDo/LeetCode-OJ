
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
