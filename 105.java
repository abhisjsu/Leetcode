/**
105. Construct Binary Tree from Preorder and Inorder Traversal
DescriptionHintsSubmissionsDiscussSolution
Given preorder and inorder traversal of a tree, construct the binary tree.

Note:
You may assume that duplicates do not exist in the tree.

For example, given

preorder = [3,9,20,15,7]
inorder = [9,3,15,20,7]
Return the following binary tree:

    3
   / \
  9  20
    /  \
   15   7

Beat %age = 42.97%
"Keep the track of preIndex in each recurive call and find the same
value in the inorder, till all the elements in the preorder have been
traversed OR instart >inEnd"
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
   	public int pindex = 0;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return this.createTreeHelper(0,inorder.length-1,preorder,inorder);
    }

    public TreeNode createTreeHelper( int inStart, int inEnd, int[] preorder, int[] inorder)
    {
        if(pindex>=preorder.length || inStart>inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[pindex]);

        int index = -1;

        for(int i=inStart;i<=inEnd;i++)
        {
            if(inorder[i]==root.val)
            {
                index = i;
                break;
            }
        }
         	this.pindex++;

            if(pindex>=preorder.length)
            {
                root.left = null;
                root.right = null;
            }
            else
            {
                root.left = createTreeHelper(inStart,index-1,preorder,inorder);
                root.right = createTreeHelper(index+1,inEnd,preorder,inorder);
            }


            return root;
    }
}
