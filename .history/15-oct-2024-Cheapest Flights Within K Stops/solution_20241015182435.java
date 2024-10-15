package 15-oct-2024-Cheapest Flights Within K Stops;

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        
        
   int[] prices = new int[n] ; 
        
        Arrays.fill(prices , Integer.MAX_VALUE) ; 
        
        prices[src] = 0 ;
        
        
        for( int i = 0 ; i <= k ; i++ )
        {
            
            int tmpPrice[] = prices.clone() ; 
            
             for( int[] flight :flights )
             {
                 
                 int tempSrc =  flight[0] ; 
                 int tempDes = flight[1] ; 
                 int cost = flight[2] ; 
                 
                 
                 if(prices[tempSrc] == Integer.MAX_VALUE) continue ; 
                 
                  if(tmpPrice[tempDes]  > cost + tmpPrice[tempSrc] )
                  {
                      tmpPrice[tempDes]  = cost + tmpPrice[tempSrc]  ;
                  }
                 
                 
                 
                 
                 
             }
            
            prices = tmpPrice ;
               
            
        }
        
     return    prices[dst] != Integer.MAX_VALUE ? prices[dst] : -1 ; 
        
        
    }        
        
    }
