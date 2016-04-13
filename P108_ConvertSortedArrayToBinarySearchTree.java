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
public class P108_ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums,0,nums.length-1);
    }

    private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end){
        if(start>end){
            return null;
        }else if(start==end){
            return new TreeNode(nums[start]);
        }else{
            int mid = (start+end)>>1;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = sortedArrayToBSTHelper(nums,start,mid-1);
            root.right= sortedArrayToBSTHelper(nums,mid+1,end);
            return root;
        }
    }
}
