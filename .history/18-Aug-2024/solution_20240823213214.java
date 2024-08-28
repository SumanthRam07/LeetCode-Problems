package 18-Aug-2024;

4.3 List of Depths: Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).

SOLUTION
Though we might think at first glance that this problem requires a level-by-level traversal, this isn't actually necessary. We can traverse the graph any way that we'd like, provided we know which level we're on as we do so.
Wecanimplementasimplemodificationofthepre-ordertraversalalgorithm,wherewepassinlevel + 1 to the next recursive call. The code below provides an implementation using depth-first search.
void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists,

public void createLevelLinkedList(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {

    { 
        if(root == null)
        {
            return  ; 

        }
     
        LinkedList<TreeNode> list = null ; 


        if( lists.size() == level)
        {
            list = new LinkedList(root.val) ; 
            lists.add(list) ;

           
        }
        else
        {
            list = lists.get(level) ;
            
        }

        list.add(root) ;
    
        createLevelLinkedList(root.left ,ArrayList<LinkedList<TreeNode>> lists , level+1 ) ;

        createLevelLinkedList(root.right ,ArrayList<LinkedList<TreeNode>> lists , level+1 ) ;




    }

