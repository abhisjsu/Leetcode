/*
Given a binary tree, return the inorder traversal of its nodes' values.

Example:

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
Follow up: Recursive solution is trivial, could you do it iteratively?

Beat %age: 100%
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    List<Integer> output = new ArrayList<>();

    public void recursiveTraversal(TreeNode root)
    {
        if(root ==null)
            return;

        if(root.left!=null)
            recursiveTraversal(root.left);

        this.output.add(root.val);

        if(root.right!=null)
            recursiveTraversal(root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        recursiveTraversal(root);
        return this.output;
    }
}
