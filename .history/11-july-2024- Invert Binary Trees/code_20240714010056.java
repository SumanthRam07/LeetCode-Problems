package 11-july-2024- Invert Binary Trees;
class Solution {
    
    
    
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        
        // Recursively invert the left and right subtrees
        postOrder(root.left);
        postOrder(root.right);
        
        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    public TreeNode invertTree(TreeNode root) {
        
        
         if (root == null) {
            return root;
        }
        
        postOrder(root);
        
        return root;
        
    }
}