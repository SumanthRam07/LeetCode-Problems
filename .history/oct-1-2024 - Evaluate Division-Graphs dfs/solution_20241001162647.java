class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
        
    
        
        
        HashMap<String , HashMap<String , Double>> map = new HashMap<>() ; 
        
        int i = 0 ; 
        
        
        for( List<String> tempList : equations)
        {
            
            map.computeIfAbsent(tempList.get(0) , k -> new  HashMap<String , Double>()).put( tempList.get(1) , values[i]) ;
            
            
             map.computeIfAbsent(tempList.get(1) , k -> new HashMap<String , Double>()).put( tempList.get(0) , 1/values[i]) ;
            
            
            
              
             i++ ;       
        }
        
        double[] result = new double[queries.size()] ;
        
         int pos = 0 ; 
        
        for( List<String> query : queries )
        {
         
            
            result[pos++] =  Dfs(query.get(0) ,query.get(1) , map , new HashSet<String>());
            
                       
        }
        
        
        return result ; 
       
        
    }
    
    
    public  double Dfs(String src , String dest , HashMap<String , HashMap<String , Double>> map , HashSet<String>visited  )
    {
        
        if( !(map.keySet().contains(src) && map.keySet().contains(dest)))  return -1.0 ; 
        
        if( src.equals(dest)) return 1 ; 
        
        visited.add(src) ; 
        
        HashMap<String, Double> children = map.get(src) ;
        
            
            for( String child : children.keySet()  )
            {
                if( ! visited.contains(child))
                {
                
              Double a =   Dfs( child , dest , map , visited) ;
                    
                    if( a != -1)
                    {
                        
                        return a * children.get(child) ; 
                    }
              
                }    
        }
              
        
        
               return -1 ;   
        
    }
    
    
}
