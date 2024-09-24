class Solution {
    public int findCircleNum(int[][] isConnected) {
        
        
        int n = isConnected.length ; 
        
        int provinces  = 0 ; 
        
         boolean[] visit = new boolean[n] ; 
        
        for( int i = 0 ; i < n ; i++)
        {
            
            if( !visit[i])
            {
                provinces++ ;
                Dfs(i ,isConnected , visit ) ;
                
            }
            
           
            
            
            
            
        }
        
        return provinces ;
        
        
    }
    
    
    public void Dfs( int node , int[][] isConnected , boolean[] visit)
    {
        visit[node] = true ; 
        
        for( int i = 0 ; i <  isConnected.length ; i++)
        {
            
            if( !visit[i]  && isConnected[node][i] ==1) Dfs(i ,isConnected , visit ) ;
            
                 
            
        }
        
        
        
        
        
    }
    
    
    
    
    
    
    
}