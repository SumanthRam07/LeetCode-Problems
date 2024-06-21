package June-19-2024;

public class code {


    class Solution {
        public ListNode deleteMiddle(ListNode head) {
            
            
            ListNode temp = head ; 
            int count = 0 ; 
            
            
            while( temp != null)
            {
                temp = temp.next ; 
                count ++ ; 
            }
            
            
            if( count == 1)
            {
                return null  ; 
            }
            
            else
            {   
                temp = head ; 
                
                count = count /2 ; 
                
                int i = 0 ; 
                
                while( i < count-1  )
                {
                    
                    temp = temp.next ; 
                    i++ ;
                }
                
                temp.next = temp.next.next ; 
           
                
            }
            
            
            
            return head ; 
            
        }
    }git 
    
}
