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
 Solution by Dynamic Programming 
*/
class Solution {

    Map<TreeNode,Integer> depths = new HashMap<>();
    Map<TreeNode,Integer> diameters = new HashMap<>();

    public int calculateDepths(TreeNode root)
    {
        if(root ==null)
            return 0;

        int left = 0;
        int right = 0;

        if(root.left!=null)
        {
            if(depths.containsKey(root.left))
            {
                left  = depths.get(root.left);
            }
            else
            {
                left = calculateDepths(root.left);
                depths.put(root.left,left);
            }

        }

        if(root.right!=null)
        {
            if(depths.containsKey(root.right))
            {
                right  = depths.get(root.right);
            }
            else
            {
                right = calculateDepths(root.right);
                depths.put(root.right,right);
            }
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
            if(diameters.containsKey(root.left))
            {
                left  = diameters.get(root.left);
            }
            else
            {
                left = calculateDepths(root.left);
                diameters.put(root.left,left);
            }
        }

        if(root.right!=null)
        {
            if(diameters.containsKey(root.right))
            {
                right  = diameters.get(root.right);
            }
            else
            {
                right = calculateDepths(root.right);
                diameters.put(root.right,right);
            }
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
            max = currentDiameter;


        return max;
    }

    public int diameterOfBinaryTree(TreeNode root) {
        int max = traversal(root, 0);
        return max;

    }
}
