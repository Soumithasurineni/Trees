/*
Given the root of a binary tree, return the leftmost value in the last row of the tree.
*/
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
    public int findBottomLeftValue(TreeNode root) {
        int temp=0;
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        {
            return 0;
        }
        q.add(root);
        q.add(null);
        temp=root.val;
        while(!q.isEmpty())
        {
            TreeNode currentNode=q.peek();
            q.poll();
            if(currentNode==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                temp=q.peek().val;
                q.add(null);

            }
            else{
                if(currentNode.left!=null)
                q.add(currentNode.left);
                if(currentNode.right!=null)
                q.add(currentNode.right);
            }
        }
        return temp;

        
    }
}
