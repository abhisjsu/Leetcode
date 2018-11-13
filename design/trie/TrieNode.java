package com.interview.leetcode.november.design.trie;

public class TrieNode {


    char current;

    TrieNode children[] = new TrieNode[27];


    public TrieNode(char val)
    {
        this.current = val;
    }
}
