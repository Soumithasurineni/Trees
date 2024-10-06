/*
Given a Binary Tree. Check whether it is Symmetric or not, i.e. whether the binary tree is a Mirror image of itself or not.
*/
class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean check_is_identical(Node ls,Node rs){
        if(ls!=null && rs==null)
        {
            return false;
        }
        else if(ls==null && rs!=null)
        {
            return false;
        }
        else if(ls==null && rs==null)
        {
            return true;
        }
        else{
            if(ls.data!=rs.data)
            {
                return false;
            }
            else{
                return check_is_identical(ls.left,rs.right) && check_is_identical(ls.right,rs.left);
            }
        }
    }
    public static boolean isSymmetric(Node root)
    {
        // add your code here;
        if(root==null)
        return true;
        else{
            return check_is_identical(root.left,root.right);
        }
    }
}
