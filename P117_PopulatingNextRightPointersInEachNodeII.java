/*
    Follow up for problem "Populating Next Right Pointers in Each Node".

    What if the given tree could be any binary tree? Would your previous
    solution still work?

    Note:

    You may only use constant extra space.
    For example,
    Given the following binary tree,
             1
           /  \
          2    3
         / \    \
        4   5    7
    After calling your function, the tree should look like:
             1 -> NULL
           /  \
          2 -> 3 -> NULL
         / \    \
        4-> 5 -> 7 -> NULL
 */

public class P117_PopulatingNextRightPointersInEachNodeII{
    public void connect(TreeLinkNode root) {
        TreeLinkNode current = root;
        while(current!=null){
            //dummy Node for next level's start
            TreeLinkNode nextLevelStart = new TreeLinkNode(0);
            TreeLinkNode child = nextLevelStart;
            while(current!=null){
                if(current.left!=null){
                    child.next = current.left;
                    child = child.next;
                }
                if(current.right!=null){
                    child.next = current.right;
                    child = child.next;
                }
                current = current.next;
            }
            // move to next level;
            current = nextLevelStart.next;
        }
    }
}
