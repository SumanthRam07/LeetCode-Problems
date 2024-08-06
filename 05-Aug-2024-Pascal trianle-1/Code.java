package 05-Aug-2024-Pascal trianle;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        
          List<Integer> baseCase = new LinkedList(Arrays.asList(1)) ; 
      List<List<Integer>> solution = new LinkedList<>() ; 
        
        solution.add(baseCase) ; 
        
        int i = 1 ; 
        
 
        
        while(i < numRows)
        {
            
           int j = 0 ; 
            
            
             
          List<Integer> temp1 = solution.get(i-1) ;
            
            List<Integer> temp2 = new LinkedList<>() ;
            temp2.add(1) ;
            
            while( j < temp1.size()-1)
            {
                temp2.add( temp1.get(j) + temp1.get(j+1)) ;
                
                
                j++ ;
             
                
            }
            
            temp2.add(1) ; 
            
            solution.add(temp2) ;
            
            
            
            i++;
            
        }
        
        return solution ; 
        
        
        
    }
}