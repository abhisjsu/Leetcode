package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.TreeNode;

public class InOrderSuccessor_Prob285 {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        TreeNode node = new TreeNode(0);

        if(root.left.val == p.val)
            return root;

        if(p.val > root.val)
            return inorderSuccessor(root.right,p);
        else
            return inorderSuccessor(root.left,p);

    }
}

