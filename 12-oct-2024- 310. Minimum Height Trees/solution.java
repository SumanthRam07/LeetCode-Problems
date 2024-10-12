class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        
        ArrayList<Integer> result = new ArrayList<>() ; 
        
     
        
         if (n == 1) {
            result.add(0);
            return result;
        }
        
           int[] degree = new int[n] ;
        
        
        HashMap<Integer , ArrayList<Integer>> map = new HashMap<>() ; 
        
        
        for( int[] edge : edges)
        {
            
            degree[edge[0]]++ ; 
             degree[edge[1]]++ ; 
            
            
            map.computeIfAbsent(edge[0] , k -> new ArrayList<>()).add(edge[1]) ;
            
             map.computeIfAbsent(edge[1] , k -> new ArrayList<>()).add(edge[0]) ;
             
        }
     
          Queue<Integer> q = new LinkedList<>() ; 
         HashSet<Integer> visited = new HashSet<>() ; 
         
          for( int i = 0 ; i < n ; i++)
          {
              if( degree[i] == 1)
              {
                  System.out.println(i);
                  q.add(i) ;
                
              }
              
          }
        
       
        
        while( n > 2)
        {
            
            int size = q.size() ; 
            n -=size ; 
            
            while( size-- >0)
            {
                
                int curr = q.poll() ; 
                
                
                for( int temp : map.get(curr))
                {
                    degree[temp] -- ; 
                    
                    if(degree[temp] ==1 )
                    {
                        q.add(temp) ; 
                    }
               
                    
                }    
                
            }
            
        }  
            result.addAll(q) ;
            
  return result ;  
        
        
        
        
        
 
        
        
    }
    
    
      
    
}