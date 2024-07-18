package 18-jul-2024- Maximum Depth of a bst;

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
    
    
    public int postOrder(TreeNode root)
    {
        
        if( root == null)
        {
            return 0 ; 
        }
        
        int leftHeight = postOrder(root.left) ; 
        int rightHeight =  postOrder(root.right) ; 
        
        
        return Math.max( leftHeight , rightHeight)+1 ; 
        
        
        
    }
    
    
    
    
    
    public int maxDepth(TreeNode root) {
        
        return postOrder(root) ;
        
        
    }
}
