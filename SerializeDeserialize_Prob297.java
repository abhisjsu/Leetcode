package com.interview.leetcode.october;

import com.interview.leetcode.datastructure.TreeNode;

public class SerializeDeserialize_Prob297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        StringBuffer output = new StringBuffer();

        this.serializeHelper(root,output);

        return new String(output);
    }

    public void serializeHelper(TreeNode root, StringBuffer output)
    {

        if(root ==null)
        {
            output.append(",null");
            return;
        }

        output.append(root.val+",");

        serializeHelper(root.left, output);
        serializeHelper(root.right,output);


    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        TreeNode root = null;

        return root;
    }
}
