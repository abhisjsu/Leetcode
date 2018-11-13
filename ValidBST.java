package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.BinarySearchTree;
import com.interview.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class ValidBST {

    TreeNode root;
    List<Integer> traversal = new ArrayList<>();

    public ValidBST() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int inputBst[] = {10,12,4,5,6,22,43,28,50};
        for(int val:inputBst)
            binarySearchTree.insertNode(val);

        this.root = binarySearchTree.getRoot();
    }

    public void traverse(TreeNode root)
    {
        if(root ==null)
            return;

        if(root.left!=null)
            traverse(root.left);

        this.traversal.add(root.val);

        if(root.right!=null)
            traverse(root.right);

    }

    public boolean isValidUsingInorder()
    {
        this.traverse(this.root);
        int len = this.traversal.size();

        for(int i=1;i<len;i++)
        {
            if(this.traversal.get(i)<this.traversal.get(i-1))
                return false;
        }

        return true;
    }

    public int findMaxInLeftSubtree(TreeNode root)
    {
        while(root.right!=null)
            root = root.right;
        return root.val;
    }

    public int findMinInRightSubtree(TreeNode root)
    {
        while(root.left!=null)
            root = root.left;
        return root.val;
    }

    public boolean isValidBST(TreeNode root)
    {
        if(root ==null)
            return true;

        boolean left = true;
        boolean right = true;

        if(root.left!=null)
        {
            int leftMax = findMaxInLeftSubtree(root.left);
            if(root.val <= leftMax)
                return false;

            left = isValidBST(root.left);

        }

        if(root.right!=null)
        {
            int rightMin = findMinInRightSubtree(root.right);
            if(root.val >= rightMin)
                return false;

            right = isValidBST(root.right);
        }

        return left&&right;
    }


    public static void main(String argv[])
    {
        ValidBST v = new ValidBST();
        System.out.println(v.isValidUsingInorder());
        System.out.println(v.isValidBST(v.root));
    }
}
