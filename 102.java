/*
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        
        if(root == null)
            return output;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            List<Integer> level = new ArrayList<>();
            int size = q.size();
            
            for(int i=0;i<size;i++)
            {
                TreeNode current = q.poll();
                level.add(current.val);
                
                if(current.left!= null)
                    q.add(current.left);
                
                if(current.right!=null)
                    q.add(current.right);
            }
            
            output.add(level);
        }
        
        return output;
        
    }
}