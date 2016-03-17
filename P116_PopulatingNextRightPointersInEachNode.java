
public class P116_PopulatingNextRightPointersInEachNode{
    public void connect(TreeLinkNode root) {
        TreeLinkNode levelStart = root;
        while(levelStart!=null){
            TreeLinkNode current = levelStart;
            while(current!=null){
                if(current.left!=null) current.left.next=current.right;
                if(current.right!=null&&current.next!=null) current.right.next = current.next.left;
                current = current.next;
            }
            levelStart = levelStart.left;
        }
    }
}
