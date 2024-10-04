/*
Problem statement
You have been given a Binary Tree of integers. You are supposed to return the level order traversal of the given tree.
*/
import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	ArrayList<Integer> result=new ArrayList<>();
	Queue<BinaryTreeNode> q=new LinkedList<>();
	if(root==null)
	{
		return result;
	}
	q.add(root);
	while(!q.isEmpty())
	{
		BinaryTreeNode currentNode=q.peek();
		q.poll();
		if(currentNode.left!=null)
		q.add(currentNode.left);
		if(currentNode.right!=null)
		q.add(currentNode.right);
		result.add(currentNode.val);
	}
	return result;

  }

}
