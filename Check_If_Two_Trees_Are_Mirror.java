/*
Problem statement
You are given two arbitrary binary trees consisting of N and M number of nodes respectively, your task is to check whether the two trees are mirror of each other or not.
Two trees are said to be mirror of each other, if
1. Roots of both the given trees are same.
2. Left subtree of the root of the first tree is the mirror of the right subtree of the root of the second tree.
3. Right subtree of the root of the first tree is the mirror of the left subtree of the root of the second tree.
*/
public class Solution {
	public static boolean areMirror(BinaryTreeNode root1, BinaryTreeNode root2) {
		// Write your code here
		if(root1==null && root2==null)
		return true;
		else if(root1!=null && root2==null)
		return false;
		else if(root1==null && root2!=null)
		return false;
		else{
			if(root1.data!=root2.data)
			{
				return false;
			}
			else{
				return areMirror(root1.left,root2.right) && areMirror(root1.right, root2.left);
			}
		}
	}
}
