package 13-Aug-2024;

public  */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        
        
             List<Integer> solution = new ArrayList<>() ;
            Deque<TreeNode> q = new LinkedList<>();
        
      
        
        
        if( root == null)
        {
            return solution ;
        }
       
        
        q.add(root) ; 
        
        
        while( !q.isEmpty())
        {
           
            int levelSize = q.size() ;
            
            for( int i = 0 ; i < levelSize ; i++)
            {
                TreeNode temp = q.removeFirst( ) ; 
                
            if(i == levelSize-1 )  solution.add(temp.val) ; 
  
            if( temp.left !=null)
            {
                q.add(temp.left) ;
            }
             if( temp.right !=null)
            {
                q.add(temp.right) ;
            }
            
            }   
            
        }
        
    return solution ; 
        
        
        
        
        
    }
} {
    
}
