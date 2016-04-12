/*
    https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

    Given an array where elements are sorted in ascending order, convert it to 
    a height balanced BST.

    @tags: Tree, Depth-first Search
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
public class P108_ConvertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] num) {
        if(num==null||num.length==0){
            return null;
        }
        return buildSubBST(num,0,num.length-1);
    }
    
    private TreeNode buildSubBST(int[] num, int startIndex, int endIndex){
        if(startIndex>endIndex){
            return null;
        }
        int midIndex = (startIndex + endIndex)/2;
        TreeNode left = buildSubBST(num,startIndex,midIndex-1);
        TreeNode root = new TreeNode(num[midIndex]);
        TreeNode right = buildSubBST(num,midIndex+1, endIndex);
        root.left =  left;
        root.right = right;
        return root;
    }
}
