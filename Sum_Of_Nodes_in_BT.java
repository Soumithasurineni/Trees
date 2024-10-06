/*
Given a Binary Tree of size N, your task is to complete the function sumBt(), that should return the sum of all the nodes of the given binary tree.
*/
class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head==null)
        return 0;
        else{
            int sum= head.data + sumBT(head.left) + sumBT(head.right);
            return sum;
        }
        
    }
}
