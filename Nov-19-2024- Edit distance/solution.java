package Nov-19-2024- Edit distance;

class Solution {
    public int minDistance(String word1, String word2) {
        
        
        int m = word1.length() ; 
        int n = word2.length() ; 
        
        int[][] costdp = new int[m+1][n+1] ; 
        
        for( int i = 0 ; i <= m ; i++ ) costdp[i][0] = i ; 
        
         for( int j = 0 ; j <=n ; j++ ) costdp[0][j] = j ; 
        
        
        for( int i = 1 ; i <= m ; i++)
        {
            
            
            for( int j = 1 ; j <=n ; j++)
            {
                
                
                if(  word1.charAt(i-1) ==  word2.charAt(j-1) )
                {
                    
                    costdp[i][j] = costdp[i-1][j-1];
                }
                else
                {
                    
     costdp[i][j] = Math.min(costdp[i-1][j-1] , Math.min(costdp[i-1][j] , costdp[i][j-1]))+1 ;  
                   
                    
                }     
                
            }
            
 
            
        }
        
        
        return costdp[m][n] ;
        
        
        
    }
}