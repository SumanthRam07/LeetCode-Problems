class Solution {
    
    int changes ;
 public int minReorder(int n, int[][] connections) {
     
changes = 0 ; 
     boolean[] visited = new boolean[n] ;
     
     HashMap<Integer , List<List<Integer>>> adj = new HashMap<>() ;
     
     for( int[] connection : connections)
     {
        adj.computeIfAbsent( connection[0] , k -> new ArrayList<List<Integer>>() ).add(Arrays.asList(connection[1] ,1)) ;
     
         adj.computeIfAbsent( connection[1] , k -> new ArrayList<List<Integer>>() ).add(Arrays.asList(connection[0] ,0)) ;
      
      
     
      
      
      }
      dfs(0 , visited , adj ) ;
     
 
     
     return changes ; 
 }
 
 
 
 public void dfs(int node , boolean[] visited , HashMap<Integer , List<List<Integer>>> adj)
 {
     
      
     
     visited[node] = true ; 
     
 
   
     for( List<Integer> tempList : adj.get(node) )
        
     {
         
         
          
             System.out.println(" ia m at start "+ tempList.get(0) + tempList.get(1)) ;
     
     
         int neighbour = tempList.get(0) ;
         int direction = tempList.get(1) ; 
         
         
            if(!visited[neighbour]) 
            {
     
             
             System.out.println(" ia m coming here" + neighbour) ;
             
             changes += direction ; 
  
             dfs( neighbour , visited , adj) ;
         
            }
         
         
     }
     
     
     
     
     
     
     
 }
 
 
}