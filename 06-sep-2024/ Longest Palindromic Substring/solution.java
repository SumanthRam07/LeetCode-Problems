package 06-sep-2024. Longest Palindromic Substring;

class Solution {
    public String longestPalindrome(String s) {
        
        
        if( s.length() ==1   ) return s ; 
        
        String lp = ""; 
        
        
        for( int i = 1 ; i < s.length() ; i++)
        {
           //checking odd length  
            int low = i ; 
            int high = i ;
            
            while( s.charAt(low) == s.charAt(high))
            {
                
                low -- ; 
                high ++ ;
                
                if( low < 0 || high >= s.length())  break ;        
                
            }
            
            String palindrome = s.substring(low+1 , high) ;
            
            if( palindrome.length() > lp.length())  lp = palindrome ; 
            
            

           //checking even length 

            
                low = i-1 ; 
                high = i ;
            
             while( s.charAt(low) == s.charAt(high))
            {
                
                low -- ; 
                high ++ ;
                
                if( low < 0 || high >= s.length())  break ;        
                
            }
            
               palindrome = s.substring(low+1 , high) ;
            
            if( palindrome.length() > lp.length())  lp = palindrome ; 
            
            
     
            
        }
            
        return lp ; 
        
        
        
    }
}