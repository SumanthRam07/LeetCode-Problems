package 16-july-Delete a node in BST;

class Solution {
    public TreeNode getMin(TreeNode node)
    {
        if( node.left == null )
        {
           return node ;
 
        }
 
        return getMin(node.left) ;
    }
 
     public TreeNode deleteNode(TreeNode root, int key) {
 
 
         if( root == null)
         {
             return root ;   
         }
         if( key < root.val)
         {
            root.left = deleteNode(root.left , key);
 
         }
       else  if( key > root.val)
         {
            root.right = deleteNode(root.right , key);
 
         }
       else
       {
             if( root.left != null && root.right !=null)
             {
                TreeNode temp = getMin(root.right); 
                 root.val = temp.val ; 
                 root.right = deleteNode(root.right , temp.val );
 
 
 
             }
             else if( root.right !=null)
             {
                 root = root.right;
             }
              else if( root.left !=null)
             {
                 root = root.left;
             }
             else
             {
                 root = null ; 
             }
             
 
       }
         return root ; 
     }
 }