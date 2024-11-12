package 11-Nov-2024- 2024-Dinamo.trinamo;

class Solution {
    public int numTilings(int n) {
        
        
      long mod = 1000000007; 
        
        
        if( n == 0 ) return 0 ; 
        if( n ==1 ) return 1 ; 
        if( n == 2 ) return  2 ; 
       
        
        
        long dp[] = new long[n+1] ; 
        
        dp[0] = 0 ; 
        dp[1] = 1 ; 
        dp[2] = 2 ;
        dp[3] = 5 ;
        
        for( int i = 4 ; i <= n ; i ++)
        {
            System.out.println("i am coming here") ;
            dp[i] = ((2 * dp[i-1] )+ dp[i-3] ) % mod ; 
            
            
            
        }
        
        
        return (int)dp[n] ; 
        
        
        
    }
}