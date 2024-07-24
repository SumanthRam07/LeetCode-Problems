package 18-july-leaf similar trees;

class Solution {
    
    ArrayList<Integer> list1 = new ArrayList<>() ;
    
     ArrayList<Integer> list2 = new ArrayList<>() ; 
    
    
    
    public void postOrder1(TreeNode root)
    {
        if( root == null)
        {
            return ; 
        }
        
        
        postOrder1(root.left) ;
        postOrder1(root.right) ;
        
        if( root.left == null && root.right == null)
        {
            list1.add( root.val) ;
        }
        
        
    }
    
    
     
    public void postOrder2(TreeNode root)
    {
        if( root == null)
        {
            return ; 
        }
        
        
        postOrder2(root.left) ;
        postOrder2(root.right) ;
        
        if( root.left == null && root.right == null)
        {
            list2.add( root.val) ;
        }
        
        
    }
    
    
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
      postOrder1( root1) ;
      postOrder2(root2) ;
      
        return list1.equals(list2);
        
        
        
        
        
        
        
    }
}