/*
Given a Binary Tree, return its Left view. 
The left view of a Binary Tree is a set of nodes visible when the tree is visited from the Left side. 
If no left view is possible, return an empty array.
*/

//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> result=new ArrayList<Integer>();
      Queue<Node> q=new LinkedList<>();
      if(root==null)
      {
          return result;
      }
      q.add(root);
      q.add(null);
      result.add(root.data);
      while(!q.isEmpty())
      {
          Node currentNode=q.peek();
          q.poll();
          if(currentNode==null)
          {
              if(q.isEmpty())
              {
                  break;
              }
              result.add(q.peek().data);
              q.add(null);
              
          }
          else{
              if(currentNode.left!=null)
              q.add(currentNode.left);
              if(currentNode.right!=null)
              q.add(currentNode.right);
          }
      }
      return result;
    }
}
