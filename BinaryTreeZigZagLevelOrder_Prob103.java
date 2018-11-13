package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.TreeNode;

import java.util.*;

public class BinaryTreeZigZagLevelOrder_Prob103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {


        List<List<Integer>> output = new ArrayList<>();
        if(root == null)
            return output;

        int lval = 1;
        Queue<TreeNode> Q = new LinkedList<>();

        Q.add(root);

        while(!Q.isEmpty())
        {
            List<Integer> level = new ArrayList<>();
            int size = Q.size();

            for(int i =0;i<size;i++)
            {
                TreeNode current = Q.poll();

                if(current.left!=null)
                    Q.add(current.left);

                if(current.right!=null)
                    Q.add(current.right);

                level.add(current.val);
            }
            if(lval%2==0)
                Collections.reverse(level);

            lval++;
            output.add(level);
        }

        return output;
    }



}
