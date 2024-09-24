class Solution {
    

    
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
              
    HashSet<Integer> visited = new HashSet<>() ; 
        
        Stack<Integer> stack = new Stack<>() ;
        
      
        stack.push(0) ;
        
        
        while( !stack.isEmpty())
        {
            
            int currentRoom = stack.pop() ;
          
          if( visited.contains(currentRoom) ) continue ; 
            
            
            visited.add(currentRoom) ;
            
            List<Integer> keys = rooms.get(currentRoom) ;
            
            keys.stream().forEach( i ->stack.push(i)) ;
            
            
            
       
        }
         
        
     return  ( visited.size() == rooms.size()) ? true : false ; 
        
        
        
        
        
    }
}
