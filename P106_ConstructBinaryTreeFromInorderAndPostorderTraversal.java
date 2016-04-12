/*
    https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

    Given inorder and postorder traversal of a tree, construct the binary tree.

    Note:
    You may assume that duplicates do not exist in the tree.

    @tags: Tree, Array, Depth-first Search
*/

public class P106_ConstructBinaryTreeFromInorderAndPostorderTraversal{

    private static HashMap<Integer, Integer> inorderMap = new HashMap();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return buildTreeHelper(postorder,inorder,0,0,postorder.length);
    }

    public TreeNode buildTreeHelper(int[] postorder, int[] inorder,int postStart, int inStart, int size){
        if(size<=0){
            return null;
        }else{
            TreeNode root = new TreeNode(postorder[postStart+size-1]);
            int rootIndex = inorderMap.get(root.val);
            int leftSize = rootIndex-inStart;
            int rightSize= size-1-leftSize;
            root.left = buildTreeHelper(postorder,inorder,postStart,inStart,leftSize);
            root.right = buildTreeHelper(postorder,inorder,postStart+leftSize,rootIndex+1,rightSize);
            return root;
        }
    }
}
