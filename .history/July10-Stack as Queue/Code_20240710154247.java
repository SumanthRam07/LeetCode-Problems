package July10-Stack as Queue;



    class MyQueue {
    
        Stack<Integer> mStack ;
            
             Stack<Integer> supportStack ;
   
       public MyQueue() {
           
        mStack = new Stack<>() ; 
           
       supportStack = new Stack<>() ; 
           
           
       }
       
       public void push(int x) {
           
          mStack.push(x) ; 
           
           
       }
       
       public int pop() {
           
           while(! mStack.isEmpty())
           {
               supportStack.push( mStack.pop()) ;
               
               
           }
           
           int ret =  supportStack.pop() ;
           
           while( !supportStack.isEmpty() )
           {
               mStack.push( supportStack.pop() ) ;
               
           }
           
          
           
           return ret ; 
           
             
          
       }
       
       public int peek() {
        
            while(! mStack.isEmpty())
           {
               supportStack.push( mStack.pop()) ;
               
               
           }
           
           int ret =  supportStack.peek();
           
           while( !supportStack.isEmpty() )
           {
               mStack.push( supportStack.pop() ) ;
               
           }
           
          
           
           return ret ;
           
       }
       
       public boolean empty() {
           
           
           return mStack.isEmpty() ;
           
       }
   }
    

