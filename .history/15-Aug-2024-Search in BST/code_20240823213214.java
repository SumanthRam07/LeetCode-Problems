package 15-Aug-2024-Search in BST;

class Solution {
    
    
    TreeNode sol ; 
    
    
    
    public TreeNode searchBST(TreeNode root, int val) {
        
        
            if( root == null)
            {
               return root ; 
            }
        
           
             if( root.val == val)
             {
                 sol = root ;
             }
        
           
           searchBST(root.left , val) ; 
           searchBST(root.right, val) ;
         
       
        return sol ; 
        
    }
}