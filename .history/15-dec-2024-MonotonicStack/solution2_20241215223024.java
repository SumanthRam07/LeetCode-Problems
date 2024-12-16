package 15-dec-2024-MonotonicStack;

//leeetocde : 435. Non-overlapping Intervals

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        
        Arrays.sort(intervals , (a,b)-> Integer.compare(a[1] , b[1]) ) ; 
        
        int curEnd = intervals[0][1] ; 
        
        int sol = 0 ; 
        
        
        for( int i = 1 ; i < intervals.length ; i++ )
        {
            if(  curEnd > intervals[i][0] )   sol++ ; 
            else
            {
                curEnd = intervals[i][1] ; 
                
            }   
            
            
       
        }
        
        return sol ; 
        
        
        
    }
}
