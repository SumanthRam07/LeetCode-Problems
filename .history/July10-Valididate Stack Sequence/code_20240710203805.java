package July10-Valididate Stack Sequence;

    class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            
            Stack<Integer> pushStack = new Stack<>() ; 
            
          int    j = 0 ; 
            
            for( int i = 0 ; i < pushed.length ; i++)
            {
                
                pushStack.push(pushed[i] ) ; 
                
                while(! pushStack.isEmpty() && pushStack.peek() == popped[j])
                {
                    
                    pushStack.pop() ; 
                    j++ ; 
                    
                    
                }
                
                
                
                
            }
            
            return pushStack.isEmpty() ;
            
        }
    }
    

