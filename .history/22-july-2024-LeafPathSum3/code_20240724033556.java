package 22-july-2024-LeafPathSum3;

public class code {


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
    
    public int  count = 0 ; 
    
    ArrayList<TreeNode> list1 = new ArrayList<>() ;
    

    
    public void getSum( TreeNode root , int targetSum)
    {
        
        
        if( root == null)
        {
            return ; 
        }
        
        list1.add(root) ;
        
        
        getSum(root.left , targetSum) ; 
        getSum(root.right , targetSum) ;
        
        double sum = 0 ; 
        
        
        
        for( int i = list1.size()-1 ; i>=0 ; i--)
        {
        
             sum += list1.get(i).val ; 
            if(sum == targetSum ) count++; 
           
            
        }
        
        list1.remove( list1.size()-1) ;
        
        
        
        
    }
    
    
    
    
    public int pathSum(TreeNode root, int targetSum) {
        
        
       
        
         getSum(root , targetSum) ; 
        
        return count ; 
        
        
        
    }
}
    
}
