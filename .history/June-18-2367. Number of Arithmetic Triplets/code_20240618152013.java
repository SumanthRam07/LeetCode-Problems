class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        
        HashSet<Integer> set = new HashSet<>(); 
        
        int count = 0 ; 
        
        for( int i : nums)
        {
            
            
            set.add(i) ; 
            
        }
        
        
        
        for( int i = nums.length-1 ; i >0 ; i--)
        {
            
            
           if( set.contains(nums[i]-diff))
           {
               
               if( set.contains(nums[i]-diff-diff))
               {
                   count++;
               }
           }
            
            
        }
        
        
        return count ; 
        
        
    }
}