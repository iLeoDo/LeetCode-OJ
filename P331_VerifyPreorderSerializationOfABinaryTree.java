
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
