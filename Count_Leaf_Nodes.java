/*
Problem statement
You are given a Binary tree. You have to count and return the number of leaf nodes present in it.
A binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child
A node is a leaf node if both left and right child nodes of it are NULL.
*/
import java.util.LinkedList;

/*******************************************************
    Following is the Binary Tree Node class structure.
    class BinaryTreeNode<T> {
      T data;
      BinaryTreeNode<T> left;
      BinaryTreeNode<T> right;
      
      public BinaryTreeNode(T data) {
        this.data = data;
      }
    }
*******************************************************/
import java.util.*;
public class Solution {
	public static int noOfLeafNodes(BinaryTreeNode<Integer> root) {
    // Write your code here.
    int count=0;
    if(root==null)
    {
      return 0;
    }
    Queue<BinaryTreeNode> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
      BinaryTreeNode<Integer> currentNode=q.peek();
      q.poll();
      if(currentNode.left!=null)
      q.add(currentNode.left);
      if(currentNode.right!=null)
      q.add(currentNode.right);
      if(currentNode.left==null && currentNode.right==null)
      count++;
    }
    return count;
	}
}
