package sept-14-possibleSubsets;

class Solution {
    
    List<List<Integer>> solution ;
    public List<List<Integer>> subsets(int[] nums) {
        
        
        solution = new ArrayList<>() ;  
        
        ArrayList<Integer> tempArray = new ArrayList<>() ; 
        
        solution.add(new ArrayList<Integer>());
        backtracker( 0 , nums.length , tempArray , nums ) ;
    
   
        return solution ; 
        
    
        
    }
    
    
    public void backtracker( int start , int end , ArrayList<Integer>list , int[] nums )
    {
        
        
        if( start >= end) return ; 
        
    
        
        for( int i = start ; i < end ; i++)
        {
            
            list.add( nums[i]) ; 
            
            backtracker( i+1 , end , list , nums) ;
            
            solution.add(new ArrayList<>(list)) ; 
            list.remove(list.size()-1) ;
            
     
        }
            
        
        
