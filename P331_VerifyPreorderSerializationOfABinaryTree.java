/*
    https://leetcode.com/problems/verify-preorder-serialization-of-a-binary-tree/

    One way to serialize a binary tree is to use pre-order traversal. When we 
    encounter a non-null node, we record the node's value. If it is a null node, 
    we record using a sentinel value such as #.

         _9_
        /   \
       3     2
      / \   / \
     4   1  #  6
    / \ / \   / \
    # # # #   # #
    For example, the above binary tree can be serialized to the string 
    "9,3,4,#,#,1,#,#,2,#,6,#,#", where # represents a null node.

    Given a string of comma separated values, verify whether it is a correct 
    preorder traversal serialization of a binary tree. Find an algorithm without 
    reconstructing the tree.

    Each comma separated value in the string must be either an integer or a 
    character '#' representing null pointer.

    You may assume that the input format is always valid, for example it could 
    ever contain two consecutive commas such as "1,,3".

    Example 1:
    "9,3,4,#,#,1,#,#,2,#,6,#,#"
    Return true

    Example 2:
    "1,#"
    Return false

    Example 3:
    "9,#,#,1"
    Return false

    @tags: Stack
*/

public class P331_VerifyPreorderSerializationOfABinaryTree{

    /**
     * use stack
     */
    public boolean isValidSerialization(String preorder) {
        String[] elements = preorder.split(",");
        Stack<String> stack = new Stack<String>();
        for(int i=0; i<elements.length; i++){
            String s = elements[i];

            // core reduce operation
            while(s.equals("#")&&!stack.empty()&&stack.peek().equals("#")){
                stack.pop();
                if(stack.empty()){
                    return false;
                }
                stack.pop();
            }

            // s is digit or `#`
            stack.push(s);
        }
        return stack.size()==1 && stack.pop().equals("#");

    }

    /**
     * track the depth only.
     */
    public boolean isValidSerialization(String preorder) {
        if (preorder == null || preorder.length() == 0) return false;
        String[] strs = preorder.split(",");
        int depth = 0;
        int i = 0;
        while (i < strs.length - 1) {
            if (strs[i++].equals("#")) {
                if (depth == 0) return false;
                else depth--;
            }
            else depth++;
        }
        if (depth != 0) return false;
        return strs[strs.length - 1].equals("#");
    }

}
