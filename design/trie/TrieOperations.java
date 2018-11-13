package com.interview.leetcode.november.design.trie;

public class TrieOperations {

    TrieNode root;

    public TrieOperations() {
        this.root = new TrieNode('\0');
    }

    public TrieOperations(TrieNode root) {
        this.root = root;
    }

    public void insertionInTrie(String input)
    {
        TrieNode current = this.root;
        char inputString[] = input.toCharArray();

        for(char c: inputString)
        {
            if(current.children[c-'a'+1]==null)
            {
                current.children[c-'a'+1] = new TrieNode(c);
            }

            current = current.children[c-'a'+1];
        }
    }

    public boolean searchInTrie(String input)
    {
        TrieNode current = this.root;

        char inputString[] = input.toCharArray();

        for(char c: inputString) {
            if(current.children[c -'a'+1]==null)
                return false;
            else
            {
                current = current.children[c -'a'+1];
            }
        }

        for(TrieNode t: current.children)
        {
            if(t!=null)
                return false;
        }


        return true;
    }

    public boolean startsWith(String prefix) {

//        TrieNode current = this.root;
//
//        char inputString[] = prefix.toCharArray();
//
//        for(char c: inputString) {
//            if(current.children[c -'a']==null)
//                return false;
//            else
//            {
//                current = current.children[c -'a'];
//            }
//        }
//
//        for(TrieNode t: current.children)
//        {
//            if(t!=null)
//                return false;
//        }

        return this.searchInTrie(prefix);

    }

    public static void main(String argv[])
    {
        TrieOperations trie = new TrieOperations();
        trie.insertionInTrie("apple");
        trie.insertionInTrie("abcdlk");
        trie.insertionInTrie("abcdkm");

        System.out.println(trie.searchInTrie("abcdef"));
        System.out.println(trie.searchInTrie("app"));
        System.out.println(trie.searchInTrie("abcdkm"));



    }

}
