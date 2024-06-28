package June-21- . Maximum Twin Sum of a Linked List;

public class code {

  
        public int pairSum(ListNode head) {
         
            ListNode slow = head ; 
            ListNode fast = head ;
            
            ListNode next = null ; 
            ListNode prev = null ; 
            
            while( fast != null && fast.next != null)
            {
                fast = fast.next.next ; 
                
                next = slow.next ; 
                slow.next = prev ; 
                
                  prev = slow ; 
                   slow = next ; 
               
                
            }
            
            
            
            int maxSum = 0 ; 
            
            
            while( prev != null)
            {
                
                maxSum = Math.max( maxSum , prev.val+slow.val) ;
                    prev= prev.next ; 
                slow = slow.next; 
            }
            
            
            return maxSum ;
           
    }
        

    
            
        }
                




    

