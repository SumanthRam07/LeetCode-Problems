package June-30 .Task Scheduler;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        
        
        int charCount[] = new int[26] ; 
        
        for( int i =0 ; i < tasks.length ; i++)
        {
           charCount[tasks[i]-'A']++ ;  
               
            
        }
        
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ; 
        
       for( int i : charCount)
       {
           
           if( i > 0)
           {
               pq.offer(i) ; 
           }
       }
        
       
        int time = 0 ; 
        
        
    while( !pq.isEmpty())
    {
               int taskCount = 0 ;
        int cycle = n+1 ; 
        
        List<Integer> store = new ArrayList<>() ; 
        
         while( cycle-- >0 && !pq.isEmpty())
         {
             
             int temp = pq.poll(); 
             
             if( temp >1)
             {
                 store.add(temp-1) ; 
             }
             
             taskCount++ ;     
             
         }
        
        store.forEach(pq::offer) ;
        
        time +=  pq.isEmpty() ? taskCount : n+1; 
        
        
        
        
    }
      
        
        return time ; 
        
        
      
        
        
        
    }
}
