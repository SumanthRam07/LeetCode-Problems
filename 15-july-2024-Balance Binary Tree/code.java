package 15-july-2024-Balance Binary Tree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    
    int height = 0 ;
   
   
   public int checkBalanced( TreeNode root)
   {
       if( root == null)
       {
           
           return 0 ;
       }
       
         
       
       int leftHeight =  checkBalanced( root.left) ; 
       
       if(leftHeight == -1  )
       {
           
           return -1 ; 
           
       }
       int rightHeight = checkBalanced( root.right) ; 
         if (rightHeight == -1) {
       return -1; 
   }
       
       
       if( Math.abs(leftHeight - rightHeight) >1)
       { 
           System.out.println("unbalanced :" + Math.abs(leftHeight - rightHeight)) ;
           height = -1 ;
           return -1 ;
       }
       else
       {
           System.out.println( Math.max(leftHeight, rightHeight) + 1 ) ;
           
           return Math.max(leftHeight, rightHeight) + 1; 
           
       }
       
       
       
       
       
   }
   
   public boolean isBalanced(TreeNode root) {
       
       return checkBalanced(root) != -1;
       
   }
}
