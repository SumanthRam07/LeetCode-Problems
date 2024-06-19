

//Please go through the ReadMe file , to get know more about my idea and approach




Class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        Arrays.sort(nums) ; 
        
        
        List<List<Integer>> finalList = new LinkedList<>() ;  
        
        
        for( int i = 0 ; i < nums.length ; i++)
        {
            
            if( i > 0 && nums[i] == nums[i-1])
            {
                continue ; 
            }
            
          int target = - nums[i] ; 
            
            
            
            int j = i +1 ; 
            int k = nums.length-1 ; 
            
            
            while( j < k )
            {
                
                int sum = nums[j] + nums[k] ; 
                
              
                
                if( sum == target )
                {
                    
                    List<Integer> list = Arrays.asList( nums[i] ,nums[j] ,nums[k]   ) ;
                    
                    finalList.add(list )  ; 
                    
                    
                    while( j < k && nums[j ] == nums[j+1] ) j++ ; 
                    while( j < k && nums[k ] == nums[k-1])  k-- ; 
                    
                    
                    j++ ; 
                    k-- ;    
                    
                }
              
                
                
                
                else if( sum > target)
                {
                    k-- ; 
                }
                else
                {
                    j++ ; 
                }
                
            }
            
            
            
            
            
        }
        
        
        return finalList ; 
        
        
    }
}
