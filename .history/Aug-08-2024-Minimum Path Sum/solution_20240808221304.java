class Solution {
    public int minPathSum(int[][] grid) {
    
         int row = grid.length ; 
         int col = grid[0].length ;
        
        
        int [][]  dp = new int[row][col] ;   
        
        
        
        for( int i = 0 ; i < row ; i ++)
        {
            
            for( int j = 0 ; j < col ; j++)
            {
                
                
                
                
                if( i == 0  && j != 0)
                {
                    
                    dp[i][j] = grid[i][j] + dp[i][j-1] ;
                    
                    
                }
              else if( j == 0  && i != 0)
                {
                    
                    dp[i][j] = grid[i][j] + dp[i-1][j] ;
                    
                    
                }
                else
                {
                    if( i == 0 && j == 0 ) dp[i][j] = grid[i][j] ;
                  
                    else dp[i][j] = grid[i][j] + Math.min(dp[i-1][j]  , dp[i][j-1] ) ;
                        
                    
                    
               
                    
                }
                
                
                
                
                
                
            }
            
           
            
           
           
            
            
        }

        //test
        
        //  for( int k = 0 ; k < dp.length ; k++)
        //     {
                
        //         for( int m = 0 ; m < dp[0].length ; m++)
        //         {
        //             System.out.print( dp[k][m]) ;
        //         }
        //         System.out.println() ;
        //     }
        
        
        //  return dp[row-1][col-1] ;
        
        
        
    }
}