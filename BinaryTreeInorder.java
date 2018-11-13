package com.interview.leetcode.september;

import com.interview.leetcode.datastructure.BinarySearchTree;
import com.interview.leetcode.datastructure.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorder {

    public static List<Integer> inOrder(TreeNode root)
    {
        List<Integer> output = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while(current!=null || !stack.empty())
        {
            while(current!=null)
            {
                stack.push(current);
                current = current.left;
            }

            TreeNode node = stack.pop();
            output.add(node.val);

            if(node.right!=null)
            {
                current = node.right;
            }
        }

        return output;
    }


    public static void main(String argv[])
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        int inputBst[] = {10,12,4,5,6,22,43,28,50,1};

        for(int val:inputBst)
            binarySearchTree.insertNode(val);

        for(int result : inOrder(binarySearchTree.getRoot()))
        {
            System.out.println(result);
        }
    }
}
