/*
    https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/

    Given a singly linked list where elements are sorted in ascending order,
    convert it to a height balanced BST

    @tags: Depth-first Search, Linked List
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
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
public class P109_ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        // count length of linkedlist
        ListNode current = head;
        int count = 0;
        while(current!=null){
            count++;
            current=current.next;
        }

        //nodeList used as a holder for the current
        //Node to insert into tree
        ArrayList<ListNode> nodeList = new ArrayList<ListNode>();
        nodeList.add(head);

        return buildSubBST(nodeList,0,count-1);
    }

    // inorder traverse recursively, so that add node in list one by one
    private TreeNode buildSubBST(ArrayList<ListNode> nodeList, int start, int end){
        if(start>end){
            return null;
        }
        int mid = (start+end)/2;

        TreeNode leftNode = buildSubBST(nodeList,start,mid-1);
        TreeNode rootNode = new TreeNode(nodeList.get(0).val);
        // after finishing the building of left node,
        // change elements in the nodeList to next one
        nodeList.set(0,nodeList.get(0).next);
        rootNode.left = leftNode;

        //build right node
        rootNode.right = buildSubBST(nodeList,mid+1,end);
        return rootNode;
    }
}
