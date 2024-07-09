class Solution {
    
    
    public String decoder(String s , int[] i)
        
    {
     
        StringBuilder sb = new StringBuilder() ; 
        
        while( i[0] < s.length() &&  s.charAt(i[0] ) != ']')
 {  
    
  
            
        if( Character.isDigit(s.charAt(i[0])))
        {
            int k = 0 ; 
            
            while( s.charAt(i[0]) != '[' )
            {     
            
             k = k *10 + (s.charAt(i[0]++)-'0') ; 
                
                
             }   
            
                i[0]++;
            
           
            
          String result =    decoder( s , i) ; 
            
            i[0]++; 
            
            while( k-- >0) 
            {
                sb.append(result);
            }
            
             
        
      }
        else 
        {
            
            sb.append(s.charAt(i[0]++)) ; 
        }
            
            
 }       
        
        return sb.toString() ;
        
    }  
        
        
    
    
    
    
    public String decodeString(String s) {
        
        
    return     decoder(s, new int[]{0}) ; 
        
        
        
        
        
        
    }
}