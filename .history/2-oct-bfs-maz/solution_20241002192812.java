class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        
        
        Queue<int[]> q = new LinkedList<>() ; 
        
        int[][] dirs = new int[][] { {1,0} , {-1 , 0}  , {0 , -1} , {0, 1} } ;
        
        
        q.add(entrance); 
        
        int level = 0  ; 
        
        boolean[][] visited = new boolean[maze.length][maze[0].length] ;
        
         visited[entrance[0]][entrance[1]] = true;
        
        
        while(!q.isEmpty())
        {
             int size = q.size() ; 
            level++ ;
            
            while( size-- > 0)
            {
               
                int[] cur = q.poll() ; 
                
    
                
                for( int i = 0 ; i < 4 ; i++)
                  
                {
                    
                    int [ ] dir = dirs[i] ;
                    int nextR = cur[0] + dir[0] ; 
                    
                     int nextC = cur[1] + dir[1] ; 
                    
                    
                    
                     if( nextR >= 0 &&   nextR <= maze.length-1 && nextC >=0 && nextC <= maze[0].length-1  && maze[nextR][nextC]  ==  '.' &&   !visited[nextR][nextC] )
                     {
                        
                         if( nextR == 0 ||  nextR == maze.length -1 || nextC == 0 || nextC == maze[0].length -1   )
                         {
                             
                             return level ;
                         }
                         
                         
                          visited[nextR][nextC] = true ;
                         
                         q.add( new int[]{nextR, nextC}) ;
                         
               
                        
                     }
                    
                    
                    
                    
                }
                
                   
                
            }
            
        }      
            
         return -1 ;     
            
            
            
            
            
            
            
            
        
        
        
        
        
        
        
        
    }
}
