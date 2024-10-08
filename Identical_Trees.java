/*
Given two binary trees, the task is to find if both of them are identical or not.
*/
class Solution
{
    //Function to check if two trees are identical.
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1==null && root2==null)
	    {
	        return true;
	    }
	    else if(root1==null && root2!=null)
	    {
	        return false;
	    }
	    else if(root1!=null && root2==null)
	    {
	        return false;
	    }
	    else{
	        if(root1.data!=root2.data)
	        {
	            return false;
	        }
	        else{
	            return isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
	        }
	    }
	}
	
}
