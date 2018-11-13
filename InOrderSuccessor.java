package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.BinarySearchTree;
import com.interview.leetcode.datastructure.TreeNode;

/*
If the target node doe*/

public class InOrderSuccessor {

    public TreeNode root;

    public InOrderSuccessor()
    {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        int inputBst[] = {10,12,4,22,43,28,50,20,11,1};
        for(int val:inputBst)
            binarySearchTree.insertNode(val);

        this.root = binarySearchTree.getRoot();

    }

    public TreeNode getParent(TreeNode root,int val)
    {
        if(root.left.val == val || root.right.val == val)
            return root;
        if(val > root.val)
            return getParent(root.left, val);
        else
            return getParent(root.right, val);
    }

    public int getInOrderSuccessor(int val)
    {
        TreeNode temp = this.root;

        while(temp!=null)
        {
            if(temp.val == val )
                break;
            else if(val >temp.val)
                temp = temp.right;
            else
                temp = temp.left;
        }//this loop will search will search the node in the tree with a given value

        int result = -1;

        if(temp.right!=null)
        {
            temp = temp.right;
            result = temp.val;

            while(temp!=null)
            {
                result = temp.val;
                temp = temp.left;
            }
        }
        else//This means that inorder successor is the parent node
        {
            result = this.getParent(this.root, val).val;
        }


        System.out.println("The inorder successor of "+val+" is "+result);

        return result;

    }

    public static void main(String argv[])
    {
        InOrderSuccessor p = new InOrderSuccessor();

        p.getInOrderSuccessor(4);
        p.getInOrderSuccessor(12);
        p.getInOrderSuccessor(43);

    }


}
