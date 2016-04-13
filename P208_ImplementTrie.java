/*
    https://leetcode.com/problems/implement-trie-prefix-tree/

    Implement a trie with insert, search, and startsWith methods.

    Note:
    You may assume that all inputs are consist of lowercase letters a-z.

    @tags: Trie, Design
*/

public class P208_ImplementTrie{
    class TrieNode {
        private boolean isWord;
        private TrieNode[] children;
        // Initialize your data structure here.
        public TrieNode() {
            isWord = false;
            children = new TrieNode[26];
        }
        public void setIsWord(boolean isWord){
            this.isWord=isWord;
        }

        public TrieNode getTrieNode(int index){
            return this.getTrieNode(index,true);
        }

        public TrieNode getTrieNode(int index, boolean autoCreate){
            if(this.children[index]==null&&autoCreate){
                this.children[index] = new TrieNode();
            }
            return this.children[index];
        }

        public boolean getIsWord(){
            return this.isWord;
        }
    }

    class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            TrieNode current = this.root;
            for(int i=0;i<word.length();i++){
                TrieNode target = current.getTrieNode(word.charAt(i)-'a');
                current = target;
            }
            current.setIsWord(true);
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            TrieNode current = this.root;
            for(int i=0;i<word.length();i++){
                TrieNode target = current.getTrieNode(word.charAt(i)-'a',false);
                if(target==null){
                    return false;
                }
                current = target;
            }
            return current.getIsWord();
        }

        // Returns if there is any word in the trie
        // that starts with the given prefix.
        public boolean startsWith(String prefix) {
            TrieNode current = this.root;
            for(int i=0;i<prefix.length();i++){
                TrieNode target = current.getTrieNode(prefix.charAt(i)-'a',false);
                if(target==null){
                    return false;
                }
                current = target;
            }
            return true;
        }
    }

}
