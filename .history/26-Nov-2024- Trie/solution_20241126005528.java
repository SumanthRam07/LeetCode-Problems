package 26-Nov-2024- Trie;

class Trie {
    
    
    HashMap<Character , Trie > children ; 

    boolean endOfString ; 
    

    public Trie() {
        
        
   
        children = new HashMap<>() ; 
        endOfString = false ; 
        


    }
    

    
    public void insert(String word) {
    
        Trie current  = this; 
 
        
        for( int i = 0 ; i < word.length() ; i++)
        {
             Character ch =(Character) word.charAt(i); 
            
            Trie childTrie = current.children.get(ch) ; 
            
            if( childTrie == null) 
            {
                current.children.put(ch , new Trie()) ;
          
            }
            
            current = current.children.get(ch) ; 
            
 
        }
        
        current.endOfString = true ; 
        
        
        
    }
    
    public boolean search(String word) {
        
        
        
        Trie current  = this; 
 
        
        for( int i = 0 ; i < word.length() ; i++)
        {
             char ch = word.charAt(i); 
            
            Trie childTrie = current.children.get(ch) ; 
            
            if( childTrie == null) 
            {
               return false ; 
          
            }
            else
            {
                 current = childTrie ; 
                
                
            }
         
 
        }
        
      if(  current.endOfString ) return true ;  
        
      return false ;   
    }
    
    public boolean startsWith(String prefix) {
        
            
        Trie current  = this; 
 
        
        for( int i = 0 ; i < prefix.length() ; i++)
        {
             char ch = prefix.charAt(i); 
            
            Trie childTrie = current.children.get(ch) ; 
            
            if( childTrie == null) 
            {
               return false ; 
          
            }
            else
            {
                 current = childTrie ; 
                
            }
         
 
        }
        
        return true ; 
        
        
        
        
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
