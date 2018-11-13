package com.interview.leetcode.september.treemapRevision;

import java.util.List;
import java.util.ArrayList;

import com.interview.leetcode.datastructure.BinarySearchTree;
import com.interview.leetcode.datastructure.TreeNode;

public class PreOrder_Prob144 {

    public static List<Integer> preOrder(TreeNode root)
    {
        List<Integer> output = new ArrayList<>();

        output.add(root.val);

        if(root.left!=null)
            output.addAll(preOrder(root.left));

        if(root.right!=null)
            output.addAll(preOrder(root.right));

        return output;
    }


    public static void main(String argv[])
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        int inputBst[] = {10,12,4,5,6,22,43,28,50};

        for(int val:inputBst)
            binarySearchTree.insertNode(val);

        for(int result : preOrder(binarySearchTree.getRoot()))
        {
            System.out.println(result);
        }
    }
}
