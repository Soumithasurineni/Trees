/*Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=0;
        if(root==null)
        {
            return 0;
        }
        while(!q.isEmpty())
        {
            TreeNode currentNode=q.peek();
            q.poll();
            if(currentNode==null)
            {
                count++;
                if(q.isEmpty())
                {
                    break;
                }
                q.add(null);
            }
            else{
                if(currentNode.left!=null)
                q.add(currentNode.left);
                if(currentNode.right!=null)
                q.add(currentNode.right);
            }
        }
        return count;
        
    }
}
3 20 7 --> right
3 9 15 -->left
Base for solving rightview and leftview
1--> 3,null
2--> 3 [null,9,20]
3--> 3,null,[9,20,null]
4--> 3,null,9 [20,null]
5--> 3,null,9,20 [null,15,7]
6--> 3,null,9,20,null [15,7,null]
