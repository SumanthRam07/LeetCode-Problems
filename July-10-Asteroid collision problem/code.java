package July-10-Asteroid collision problem;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        
        Stack<Integer> stack = new Stack<>() ; 
        
        
        for( int i = 0 ; i < asteroids.length ; i++)
        {
            
            if( stack.isEmpty() || asteroids[i]>0 )
            {
                stack.push(asteroids[i]) ; 
            }
            else
                
            {
               
              
                while(true)
             
                {       
                
                 int temp = stack.peek() ; 
                if( temp < 0 )
                {
                    
                    stack.push(asteroids[i]);
                     break ; 
                    
                }
               else if(temp == - asteroids[i])
                {
                    
                    stack.pop() ; 
                    break ; 
                }
                
                else if( temp > -asteroids[i])
                {
                   
                    break ; 
                }
                  
                else
                {
                    stack.pop() ; 
                    
                    if( stack.isEmpty())
                    {
                        
                        stack.push(asteroids[i]) ; 
                        break ; 
                    }
                    
                    
                    
                }
                   
            }
            
            }
            
            
        }
        
        int[] solution = new int[stack.size()] ; 
          
        int i = stack.size()-1  ; 
        
        while(i>= 0 )
        {
             solution[i] = stack.pop() ; 
            i-- ; 
            
        }
        
       return solution ; 
       
        
    }
}