/*
124. Binary Tree Maximum Path Sum
DescriptionHintsSubmissionsDiscussSolution
Given a non-empty binary tree, find the maximum path sum.

For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Example 1:

Input: [1,2,3]

       1
      / \
     2   3

Output: 6
Example 2:

Input: [-10,9,20,null,null,15,7]

   -10
   / \
  9  20
    /  \
   15   7

Output: 42


Beat %age : "99.43%
Solution :
(5 hours)"	"1. Keep one global variable maxSum initialized to Interger.MIN_VALUE
2. When first rootVal is encountered this value gets updated for the first time
3. if combined = rootVal + left +right > this.maxSum=>
                  set maxSum = combined
4. max = return Max(left,right) + rootVal;"
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
     int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        this.maxPathSumHelper(root);

        return this.maxSum;
    }

     public int maxPathSumHelper(TreeNode root) {
         if(root==null)
             return 0;

         int left =0;
         int right =0;

         int rootVal = root.val;

         if(root.left==null &&root.right==null)
         {
             if(this.maxSum <rootVal)
                 this.maxSum = rootVal;
            return rootVal;
         }

         if(root.left!=null)
            left  = Math.max(left,maxPathSumHelper(root.left));

         if(root.right!=null)
            right = Math.max(right,maxPathSumHelper(root.right));

         int maxChildren = left>right?left:right;

         int maxCombined = root.val + left +right;

         if(this.maxSum<maxCombined)
             this.maxSum = maxCombined;

        return rootVal + maxChildren;

     }
}
