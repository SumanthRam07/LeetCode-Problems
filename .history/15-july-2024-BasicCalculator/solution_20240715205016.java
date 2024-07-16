package 15-july-2024-Basic Calculator;

class Solution {
    
    char[] arr ;
   int  index = 0 ; 
    

    
    public int dfs()
    {
         int sum = 0 , operator = 1 ; 
        
        while( index < arr.length)
        {
            if( arr[index] == ')' )
            {
                break ; 
            }
            
            else if( arr[index] == '(')
            {
                index++ ; 
                sum += operator * dfs() ;
                
                
            }
            
            else if( arr[index] == '+')
            {
                operator = 1 ;
            }
            else if( arr[index] == '-')
            {
                operator =  -1 ;
            }
            else if( Character.isDigit(arr[index]))
            {
                
                StringBuilder sb = new StringBuilder() ; 
                
                while( index < arr.length && Character.isDigit(arr[index]))
                {
                    sb.append(arr[index++]) ;
                    
                    
                }
                
                
                int num = Integer.parseInt(sb.toString())*operator ;
                
                index-- ;
                
                sum = sum + num ;
                
                
                
                
            }
            
            index++ ;

            
            
            
        }
        
   
           return sum ;  
        
        
        
        
        
              
        
    }
    
    
    
    
    
    public int calculate(String s) {
      
         arr = s.toCharArray() ;
        
        return dfs() ; 
        
      
        
        
        
        
    }
}