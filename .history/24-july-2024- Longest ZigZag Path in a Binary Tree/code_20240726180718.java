package 24-july-2024- Longest ZigZag Path in a Binary Tree;

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
    
    int ans = 0 ; 
    
    /ArrayList<Integer> countArray = new ArrayList<>() ;
    
    public void dfs( TreeNode root , int count , char prev)
    {
        
        if( root == null)
        {
            //System.out.println(count) ;
            return ; 
        }
        
        
        ans = Math.max(ans , count) ; 
        //countArray.add(ans) ;
        
        if( prev =='l')
        {
            
            dfs( root.left, 1, 'l') ; 
            
            System.out.println( "l -leftCount" + count) ;
            dfs(root.right , count+1, 'r') ;
            System.out.println( "l-right" + count) ;
        }
        else
        {
            dfs( root.left , count+1 , 'l') ;
              System.out.println( "r -leftCount" + count) ;
            dfs(root.right , 1 , 'r') ;
            
           // System.out.println( "r-right" + count) ;
            
            
        }
        
        
        
        
    }
    
    public int longestZigZag(TreeNode root) {
        
        
        
        Character prev = 'l' ; 
        
        int count = 0 ; 
        
        dfs(root , count , prev) ;
        
       // System.out.println(countArray) ;
        
        return ans ;
        
    }
}
