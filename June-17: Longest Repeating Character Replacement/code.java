class Solution {
    public int characterReplacement(String s, int k) {
        
        
        int window_Start = 0 ; 
        
        
        int maxCount = 0 ;
        
        int max_length = 0 ; 
        
        
        int [] arr = new int[26] ; 
        
        
        for( int window_End = 0 ; window_End < s.length() ;  window_End++ )
        {
            
            arr[ s.charAt(window_End) - 'A']++ ; 
            
            maxCount = Math.max( maxCount ,arr[ s.charAt(window_End) - 'A'] ) ;
            
            
            
            
            if( ( window_End -window_Start + 1 ) - maxCount > k )
            {
                
                arr[s.charAt( window_Start) - 'A']-- ; 
                window_Start ++ ; 
                
                
                
                
            }
            
            
            max_length = Math.max(max_length , window_End -window_Start + 1 ) ; 
           
            
        }
        
      return max_length ; 
        
        
        
    }
}


///// please go through my readme.md file for the clear explanatory approach and feel free to reach out to me for any clarifications