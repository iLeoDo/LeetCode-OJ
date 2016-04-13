/*
    https://leetcode.com/problems/kth-smallest-element-in-a-bst/

    Given a binary search tree, write a function kthSmallest to find the kth 
    smallest element in it.

    Note: 
    You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

    Follow up:
    What if the BST is modified (insert/delete operations) often and you need 
    to find the kth smallest frequently? How would you optimize the kthSmallest 
    routine?

    @tags: Tree, Binary Search
*/

public class P230_KthSmallestElementInABST{
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack();
        TreeNode current = root;
        int count = 0;
        while(current!=null||!stack.empty()){
            while(current!=null){
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            count++;
            if(count==k){
                return current.val;
            }
            current = current.right;
        }
        return -1;
    }
}
