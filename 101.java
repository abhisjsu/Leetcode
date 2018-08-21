/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
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
    
    public boolean checkSymetric(TreeNode first, TreeNode second)
    {
        
        if(first ==null && second==null)
            return true;

        if((first !=null && second==null) ||(first ==null && second!=null))
            return false;
        
        if((first !=null && second!=null)&&(first.val != second.val))
            return false;
        
        return checkSymetric(first.left,second.right)&&checkSymetric(first.right,second.left);
        
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null || (root.left == null && root.right==null))
            return true;
        
        boolean check = checkSymetric(root.left,root.right);
        
        return check;
    }
}