/*
230. Kth Smallest Element in a BST
DescriptionHintsSubmissionsDiscussSolution
Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

Note:
You may assume k is always valid, 1 ≤ k ≤ BST's total elements.

Example 1:

Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
Example 2:

Input: root = [5,3,6,2,4,null,null,1], k = 3
       5
      / \
     3   6
    / \
   2   4
  /
 1
Output: 3
Follow up:
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
First : 11.34%	First: Inorder traversal and store in Array, reteive the k-1th element
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }

 Simplest Solution is to do the inorder traversal and obtain the sorted output in the array
    Then retreive the element on the kth index of that array
 */
class Solution {
    List<Integer> sortedList = new ArrayList<>();

    public void traverse(TreeNode root){
        if(root== null)
            return;

        if(root.left !=null)
            traverse(root.left);

        sortedList.add(root.val);

        if(root.right !=null)
            traverse(root.right);
    }

    public int kthSmallest(TreeNode root, int k) {
        this.traverse(root);

        return this.sortedList.get(k-1);

    }
}
