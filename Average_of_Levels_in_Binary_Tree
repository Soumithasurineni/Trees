/*
Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null)
        return result;
        q.add(root);
        q.add(null);
        int count=0;
        double sum=0;
        while(!q.isEmpty())
        {
            TreeNode currentNode=q.peek();
            q.poll();
            if(currentNode==null)
            {
                double avg=sum/count;
                result.add(avg);
                count=0;
                sum=0;
                if(q.isEmpty())
                {
                  break;
                }
                q.add(null);
            }
            if(currentNode!=null)
            {
                count++;
                sum=sum+currentNode.val;
                if(currentNode.left!=null)
                q.add(currentNode.left);
                if(currentNode.right!=null)
                q.add(currentNode.right);
            }
            
        }
        return result;
    }
}
