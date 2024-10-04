/*
Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        if(root==null)
        {
            return result;
        }
        result.add(root.val);
        while(!q.isEmpty()){
            TreeNode currentNode=q.peek();
            q.poll();
            if(currentNode==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                result.add(q.peek().val);
                q.add(null);
            }
            else{
                if(currentNode.right!=null)
                q.add(currentNode.right);
                if(currentNode.left!=null)
                q.add(currentNode.left);       
            }
        }
        return result;
    }
}
