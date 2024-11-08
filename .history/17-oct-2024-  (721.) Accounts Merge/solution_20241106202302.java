class Union
{
    
    int[] parent ; 
    int[] rank ; 
    
    public Union( int n)
    {
        
        parent = new int[n] ; 
        rank = new int[n] ; 
        
        for (int i = 0; i < n; i++) {
        parent[i] = i; 
        rank[i] = 1;  
    }
        
    }
    
    public int findParent( int x)
    {
       
        if( x != parent[x])  
        {
            parent[x] = findParent(parent[x]) ; 
            
        }
        
       return  parent[x] ; 
    
    }
    
    
    
    public boolean  unionFind( int x , int y)
    {
        int node1 = findParent(x) ; 
        int node2 = findParent(y) ; 
        
        if( node1 == node2) return true ; 
        
        
        if( rank[node1] > rank[node2])
        {
            parent[node2] = node1 ; 
            rank[node1] += rank[node2] ;
            
            
        }
        else
        {
             parent[node1] = node2 ; 
            rank[node2] ++ ;
            
        }
        
        return true ; 
             
    }
   
}


class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        
        int n = accounts.size() ; 
        
        Union union = new Union(n) ; 
        
        
        
        HashMap<String , Integer> emailstoAccount = new HashMap<>() ; 
        
    for( int i = 0 ; i < n ; i++ )
    {
      
        for( int j = 1 ; j < accounts.get(i).size() ; j++)
        {
            
            String email = accounts.get(i).get(j) ; 
           if( emailstoAccount.containsKey(email ))
              {
                  
               union.unionFind( i ,emailstoAccount.get(email) ) ; 
                  
              }
            else
              {
                  emailstoAccount.put(email , i) ; 
              }
            
            
            
       }
              
    }          
              
         HashMap< Integer , ArrayList<String> > accountsToEmail = new HashMap<>() ;   
        
        for( Map.Entry<String ,Integer > entry : emailstoAccount.entrySet() )
        {
            
            int account_id = entry.getValue() ; 
            String email = entry.getKey() ; 
            
            int leader_id = union.findParent(account_id) ; 
            
            accountsToEmail.computeIfAbsent( leader_id , k -> new ArrayList<String>()).add(email) ; 
          
        }
        
          List<List<String> > mergeList = new ArrayList<>() ; 
        
          for( Map.Entry< Integer , ArrayList<String> > entry : accountsToEmail.entrySet() )
          {
              
               int account_id = entry.getKey() ;
              
              ArrayList<String> emails = entry.getValue() ; 
              
              Collections.sort(emails) ; 
              
              ArrayList<String> temp_List = new ArrayList<>() ; 
              
              temp_List.add(accounts.get(account_id).get(0)) ; 
              temp_List.addAll(emails) ; 
              
              mergeList.add(temp_List) ;
              
              
              
              
              
          }
        
        
 
        return mergeList ;
        
        
    }
}
