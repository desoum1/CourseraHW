
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int lengthofLL = 0;
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            current = current.next;
            lengthofLL+=1;    
            System.out.println(lengthofLL);
        }
                current = head;
        int Currentposition = 0;

        current = head;
        Currentposition = 0;
        if(lengthofLL == n){
            return head.next;
        }
        while (current != null){
            System.out.print(current.val);
            Currentposition += 1;
             if (Currentposition == (lengthofLL-n)){
                current.next = current.next.next;
                  
                System.out.println("i");
        
            }
            current = current.next;
     
        }        
    return head;
    }
}
