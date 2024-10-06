/*
Given a binary tree, find its height.
*/
class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null)
        return 0;
        else{
            return 1+ Math.max(height(node.left),height(node.right));
        }
    }
}
