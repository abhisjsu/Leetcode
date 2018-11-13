package com.interview.leetcode.october;


import com.interview.leetcode.datastructure.TreeNode;

public class CheckBalancedBinaryTree {
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

        int max = left>right?left:right;

        return max + 1;
    }


    public boolean isBalanced(TreeNode root) {
        if(root ==null)
            return true;

        int left = calculateDepth(root.left);
        int right = calculateDepth(root.right);

        if(Math.abs(left-right)>1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);

    }
}
