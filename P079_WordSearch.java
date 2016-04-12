/*
    https://leetcode.com/problems/word-search/

    Given a 2D board and a word, find if the word exists in the grid.

    The word can be constructed from letters of sequentially adjacent cell, 
    where "adjacent" cells are those horizontally or vertically neighboring. 
    The same letter cell may not be used more than once.

    For example,
    Given board =

    [
      ['A','B','C','E'],
      ['S','F','C','S'],
      ['A','D','E','E']
    ]
    word = "ABCCED", -> returns true,
    word = "SEE", -> returns true,
    word = "ABCB", -> returns false.

    @tags: Array, Backtracking
*/

public class P079_WordSearch{
    public boolean exist(char[][] board, String word) {
        char[] wordChars = word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(existHelper(board, wordChars, 0, i,j)) return true;
            }
        }
        return false;
    }

    public boolean existHelper(char[][] board, char[] word, int index, int i, int j){
        if (i<0 || j<0 || i >= board.length || j >= board[i].length) return false;
        if (board[i][j] != word[index]) return false;
        else if(index == word.length-1) return true;

        board[i][j] ^= 256; // modify visited node before recursion
        boolean exist = existHelper(board, word, index+1, i, j+1)
            || existHelper(board, word, index+1, i, j-1)
            || existHelper(board, word, index+1, i+1, j)
            || existHelper(board, word, index+1, i-1, j);
        board[i][j] ^= 256; // modify back visited node after recursion
        return exist;
    }
}
