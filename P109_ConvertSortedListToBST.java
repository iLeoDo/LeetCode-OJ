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
public class P109_ConvertSortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        
        //count length of linkedlist
        ListNode current = head;
        int count = 0;
        while (current!=null){
            current = current.next;
            count++;
        }
        // nodeList used as a holder for the 
        // current Node to insert into tree
        ArrayList<ListNode> nodeList = new ArrayList<ListNode>();  
        nodeList.add(head);
        return buildSubBST(nodeList,0,count-1);
    }
    
    // traverse tree (Inorder)
    private TreeNode buildSubBST(ArrayList<ListNode> nodeList, int startIndex, int endIndex){
        if(startIndex>endIndex){
            return null;
        }
        int midIndex = (startIndex+endIndex)/2;
        
        TreeNode leftNode = buildSubBST(nodeList,startIndex,midIndex-1);
        TreeNode rootNode = new TreeNode(nodeList.get(0).val);
        // after finish the building of left node, 
        // change elements in the nodeList to next one
        nodeList.set(0,nodeList.get(0).next);
        rootNode.left=leftNode;
        // build right node
        TreeNode rightNode = buildSubBST(nodeList,midIndex+1,endIndex);
        rootNode.right = rightNode;
        return rootNode;
        
    }
}
