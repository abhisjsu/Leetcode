/*
Invert a binary tree.

Example:

Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9

Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1


Beat %age: 100%

"By the postOrderTraversal
1. Invert Left Subtree
2. Invert Right Subtree
3. Swap the contents of the left and right reference"
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return root;

        TreeNode left = null;
        TreeNode right = null;

        if(root.left!=null)
            invertTree(root.left);

        if(root.right!=null)
            invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        return root;

    }
}
