package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.BinarySearchTree;
import com.interview.leetcode.datastructure.TreeNode;

public class CheckBalancedBinaryTree_Prob110 {

    public int calculateDepth(TreeNode root)
    {
        if(root ==null)
            return 0;

        int left = 0;
        int right =0;

        if(root.left!=null)
            left = calculateDepth(root.left);

        if(root.right!=null)
            right = calculateDepth(root.right);

        return 1+Math.max(left,right);
    }


    public boolean isBalanced(TreeNode root) {
        if(root ==null)
            return true;

        int left = calculateDepth(root.left);
        int right = calculateDepth(root.right);

        if(Math.abs(left-right)>1)
            return false;

        boolean checkleft = true;
        boolean checkright = true;

        if(root.left!=null)
            checkleft = isBalanced(root.left);

        if(root.right!=null)
            checkright = isBalanced(root.right);

        return checkleft && checkright;
    }

    public static void main(String argv[])
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        int inputBst[] = {10,12,4,5,6,22,43,28,50};

        for(int val:inputBst)
            binarySearchTree.insertNode(val);

        CheckBalancedBinaryTree_Prob110 p = new CheckBalancedBinaryTree_Prob110();
        System.out.println(p.isBalanced(binarySearchTree.getRoot()));

    }
}


/*

Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as:
A binary tree in which the depth of the two subtrees of every node never differ by more than 1.

Algorithm:
    - Visit each node and compute the depths of the left subtree and the right subtree
    - Difference between depth[left] and depth[right] > 1 return false
    - Check the same for the left and right subtree

*/
