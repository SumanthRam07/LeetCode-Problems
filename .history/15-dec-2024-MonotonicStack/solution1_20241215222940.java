package 15-dec-2024-MonotonicStack;

//leetcode question : 901. Online Stock Span


class StockSpanner {
    
    Stack<Integer> stack ; 

    public StockSpanner() {
        
     
        stack = new Stack<>() ; 
        
        
    }
    
    public int next(int price) {
        
     
       
          if( !stack.isEmpty() && price >= stack.peek() )
        {
            int count = 1 ; 
            int counter = stack.size()-1 ; 
            
            while(counter >= 0 && stack.get(counter) <= price )  
            {
                count++ ; 
                counter-- ; 
                
                
            }
              
            stack.push(price) ;  
            
            return count ; 
            
            
        }
        else
        {
            stack.push(price)  ; 
             return 1 ;    
        }
        
            
        
        
    }
}
