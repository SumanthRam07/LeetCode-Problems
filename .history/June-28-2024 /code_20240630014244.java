package June-28-2024 ;

    class Solution {
        public int leastBricks(List<List<Integer>> wall) {
            
            Map<Integer , Integer> map = new HashMap<>() ; 
            
       
            
            for( int i = 0 ; i < wall.size() ; i++)
            {
                
                     int count = 0 ;
                for( int j = 0 ; j < wall.get(i).size()-1 ; j++)
                {
                    
                     count +=   wall.get(i).get(j) ; 
                    
                    System.out.println(count) ;
                    
                    map.put( count , map.getOrDefault(count , 0)+1) ; 
                    
                   
                    
                }
            }

            int maxCut = 0 ; 
        
            for( int key : map.keySet())
            {
                
                maxCut = Math.max(maxCut,  map.get(key)) ; 
                
            }
            
         
            
            
            return wall.size() -maxCut ; 
            
        }
    }
    
            
    
