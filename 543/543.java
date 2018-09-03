/*
Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.

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

/*
Case:
    Compare
*/
class Solution {

    public int calculateDepths(TreeNode root)
    {
        if(root ==null)
            return 0;

        int left = 0;
        int right = 0;

        if(root.left!=null)
        {
            left = calculateDepths(root.left);
        }

        if(root.right!=null)
        {
            right = calculateDepths(root.right);
        }

        int max = left>right?left:right;

        return max+1;
    }

    public int getDiameter(TreeNode root)
    {
        if(root ==null)
            return 0;

        int left = 0;
        int right = 0;

        if(root.left!=null)
        {
            left = calculateDepths(root.left);
        }

        if(root.right!=null)
        {
            right = calculateDepths(root.right);
        }

        int diameter = left + right;

        return diameter;
    }

    public int traversal(TreeNode root, int max){
        if(root==null)
            return max;

        int leftDiameter = 0;
        int rightDiameter = 0;

        if(root.left!=null)
            leftDiameter = traversal(root.left, max);

        if(root.right!=null)
            rightDiameter = traversal(root.right, max);

        int temp = leftDiameter>rightDiameter?leftDiameter:rightDiameter;

        max = max>temp?max:temp;

        int currentDiameter = getDiameter(root);

        if(max<currentDiameter)
        {
            System.out.println(max+" , "+currentDiameter);
            max = currentDiameter;
        }

        System.out.println(max);

        return max;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int max = traversal(root, 0);
        return max;

    }
}
