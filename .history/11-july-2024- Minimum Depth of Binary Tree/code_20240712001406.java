package 11-july-2024- Minimum Depth of Binary Tree;

class Solution {
    
    
    public int buildTree(int start, int end) {
        
         if( end <start)
        {
            return 1 ;
        }
        else if( end == start)
        {
            return 1;
        }
        int count = 0;
        for (int i=start; i<=end; i++) {
            int root = i;
            int a = buildTree(start, root-1);
            int b= buildTree(root+1, end);
            count += a*b ;
        }
        
       
        return count ;
    }
    
    
    
    public int numTrees(int n) {
        
        return buildTree(1, n ) ;
        
    }
}