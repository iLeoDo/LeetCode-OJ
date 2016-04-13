/*
    Given a binary tree, imagine yourself standing on the right side of it,
    return the values of the nodes you can see ordered from top to bottom.

    For example:
    Given the following binary tree,
       1            <---
     /   \
    2     3         <---
     \     \
      5     4       <---
    You should return [1, 3, 4].

    @tags: Tree, Depth-first Search, Breadth-first Search
 */
public class P199_BinaryTreeRightSideView{
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList();
        Queue<TreeNode> level = new LinkedList();
        if(root==null){
            return result;
        }

        level.add(root);
        while(!level.isEmpty()){
            int size = level.size();
            while(size>0){
                TreeNode node = level.poll();
                if(node.left!=null){
                    level.add(node.left);
                }
                if(node.right!=null){
                    level.add(node.right);
                }

                if(size==1){
                    result.add(node.val);
                }
                size--;
            }
        }
        return result;
    }
}
