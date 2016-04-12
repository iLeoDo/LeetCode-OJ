/*
    https://leetcode.com/problems/unique-binary-search-trees/

    Given n, how many structurally unique BST's (binary search trees) that 
    store values 1...n?

    For example,
    Given n = 3, there are a total of 5 unique BST's.

       1         3     3      2      1
        \       /     /      / \      \
         3     2     1      1   3      2
        /     /       \                 \
       2     1         2                 3

    @tags: Tree, Dynamic Programming
*/

public class P096_UniqueBinarySearchTrees{
    public int numTrees(int n) {
        int[] table = new int[n+1];
        table[0] = 1;
        table[1] = 1;
        for(int i = 2;i<=n;i++){
            for(int root=1;root<=i;root++){
                int left = table[root-1];
                int right = table[i-root];
                table[i]+=(left*right);
            }
        }
        return table[n];
    }
}
