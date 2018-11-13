package com.interview.leetcode.september;

import com.interview.leetcode.datastructure.BinarySearchTree;
import com.interview.leetcode.datastructure.TreeNode;

import java.util.*;


public class BinaryTreeAllPaths_Prob257 {

    public static List<Integer> output = new ArrayList<>();

    public static void binaryTreePaths(TreeNode root)
    {
        if(root ==null)
            return;

        output.add(root.val);

        if(root.left ==null && root.right ==null)
        {
            System.out.println("\nThe path is : ");
            for(int i : output)
            {
                System.out.print(i+" ");
            }

            output.remove(output.size()-1);
            return;
        }



        if(root.left!=null)
            binaryTreePaths(root.left);

        if(root.right!=null)
            binaryTreePaths(root.right);

    }


    public static void main(String argv[])
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree();

        int inputBst[] = {10,12,4,5,6,22,43,28,50,1};

        for(int val:inputBst)
            binarySearchTree.insertNode(val);


        binaryTreePaths(binarySearchTree.getRoot());

    }
}
