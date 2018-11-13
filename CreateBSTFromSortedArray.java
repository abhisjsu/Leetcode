package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.BinarySearchTree;
import com.interview.leetcode.datastructure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class CreateBSTFromSortedArray {

    public BinarySearchTree binarySearchTree = new BinarySearchTree();

    public TreeNode createBST(int input[],int start, int end)
    {
        if(start>end)
            return null;

        int mid = (start + end )/2;
        TreeNode root=new TreeNode(input[mid]);

        root.left = createBST(input,start,mid-1);
        root.right = createBST(input, mid+1, end);

        return root;
    }

    public void levelOrder()
    {
        TreeNode root = this.binarySearchTree.root;

        Queue<TreeNode> q =new LinkedList<>();

        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i =0 ;i<size;i++)
            {
                TreeNode current = q.poll();
                System.out.print(current.val+" ");

                if (current.left!=null)
                    q.add(current.left);

                if (current.right!=null)
                    q.add(current.right);
            }
            System.out.print("\n");
        }
    }

    public static void main(String argv[])
    {
        int inputBst[] = {10,12,36,42,50,55};
        CreateBSTFromSortedArray p = new CreateBSTFromSortedArray();

        p.binarySearchTree.root = p.createBST(inputBst,0,inputBst.length-1);

        p.binarySearchTree.traverseBSTInorder(p.binarySearchTree.root);
        System.out.print("\nLevel Order\n");
        p.levelOrder();
    }
}
