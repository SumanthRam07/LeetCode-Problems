package 13-Aug-2024 -Maximum Level Sum of a Binary Tree;
class Solution {
    public int maxLevelSum(TreeNode root) {
             
        Queue<TreeNode> q = new LinkedList<>() ;
        
        q.add(root) ; 
        
 
            int level = 1 ; 
        
             int maxLevel = 0 ; 
             int maxSum = Integer.MIN_VALUE ;
        
        
        while( !q.isEmpty())
        {
        
            
            int levelSize = q.size() ;
        
            
            int sum =0 ;
         
            for( int i = 0 ; i < levelSize ; i++)
            {
                
                     TreeNode temp = q.remove() ;
                
                sum +=temp.val ; 
                
                if( temp.left != null)
                {
                    q.add(temp.left) ;
                }
                if(temp.right !=null)
                {
                    q.add(temp.right) ;
                }     
      
            }
            
       
             
            if(  sum > maxSum  )
            {
               maxSum = sum ; 
                maxLevel = level ;
                
            }
            
              level ++ ;
              
        
        }
        
        
        
        return maxLevel ; 
        
        
    }
}