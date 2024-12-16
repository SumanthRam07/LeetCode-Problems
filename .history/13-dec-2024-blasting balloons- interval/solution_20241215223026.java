package 13-dec-2024-blasting balloons- interval;

class Solution {
    public int findMinArrowShots(int[][] points) {
       
      
        Arrays.sort(points , (a, b) -> Integer.compare(a[1]  , b[1])) ; 
        
        int end = points[0][1] ; 
        
        int arrows = 1 ; 
        
        for( int i = 1 ; i < points.length ; i++)
        {
            
            int tempStart = points[i][0] ; 
            
            if(tempStart > end  ) 
            {
                arrows++ ; 
                
                end = points[i][1] ;    
            }
                      
        }
            
        return arrows ; 
        
    }
}