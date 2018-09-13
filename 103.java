/*
103. Binary Tree Zigzag Level Order Traversal
DescriptionHintsSubmissionsDiscussSolution
Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
96.50%	"keep the track of level being processed, if the level is
even then reverse that ArrayList before inserting it into
the final ArrayList"
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
    int iteration = 1;
    Queue<TreeNode> queue = new LinkedList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        if(root==null)
            return output;

        this.queue.add(root);

        while(!this.queue.isEmpty())
        {
            int size = this.queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i =0;i<size;i++)
            {
                TreeNode current = this.queue.poll();

                if(current.left!=null)
                    this.queue.add(current.left);

                if(current.right!=null)
                    this.queue.add(current.right);

                level.add(current.val);
            }
            if(this.iteration%2==0)
                Collections.reverse(level);

            this.iteration++;
            output.add(level);
        }

        return output;
    }
}
