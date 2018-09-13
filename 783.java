/*
783. Minimum Distance Between BST Nodes
DescriptionHintsSubmissionsDiscussSolution
Given a Binary Search Tree (BST) with the root node root, return the minimum difference between the values of any two different nodes in the tree.

Example :

Input: root = [4,2,6,1,3,null,null]
Output: 1
Explanation:
Note that root is a TreeNode object, not an array.

The given tree [4,2,6,1,3,null,null] is represented by the following diagram:

          4
        /   \
      2      6
     / \
    1   3

while the minimum difference in this tree is 1, it occurs between node 1 and node 2, also between node 3 and node 2.
Note:

The size of the BST will be between 2 and 100.
The BST is always valid, each node's value is an integer, and each node's value is different.

Beat %age : 70.01%

Solution:
"Do the inorder traversal and keeps on storing the root.val
in an array. It gives sorted output. Then loop through the array the find
the minimum difference b/w 2 consective elements"
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
Do the inorder traversal and diff between the least nodes
*/
class Solution {

    int traversedArray[] = new int[100];
    int count = 0;
    //int diff = Integer.MAX_VALUE;

    public void traverse(TreeNode root)
    {
        if(root == null)
            return;

        if(root.left!=null)
            traverse(root.left);

        traversedArray[count++] = root.val;

        if(root.right!=null)
            traverse(root.right);
    }

    public int minDiffInBST(TreeNode root) {
        this.traverse(root);

        int diff = Integer.MAX_VALUE;
        int currentDiff = 0;

        for(int i=0;i<count-1;i++)
        {
            currentDiff = traversedArray[i+1]-traversedArray[i];
            diff =diff<currentDiff?diff:currentDiff;
        }

        return diff;

    }
}
