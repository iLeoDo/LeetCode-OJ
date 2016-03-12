
public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal{

    private static HashMap<Integer, Integer> inorderMap = new HashMap();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return buildTreeHelper(preorder,inorder,0,0,preorder.length);
    }

    public TreeNode buildTreeHelper(int[] preorder, int[] inorder,int preStart, int inStart, int size){
        if(size<=0){
            return null;
        }else{
            TreeNode root = new TreeNode(preorder[preStart]);
            int rootIndex = inorderMap.get(root.val);
            int leftSize = rootIndex-inStart;
            int rightSize= size-leftSize-1;
            root.left = buildTreeHelper(preorder,inorder,preStart+1,inStart,leftSize);
            root.right= buildTreeHelper(preorder,inorder,preStart+leftSize+1,rootIndex+1, rightSize);
            return root;
        }
    }

}
