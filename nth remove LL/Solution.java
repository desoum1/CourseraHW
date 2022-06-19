/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

//Length-n, remove index n, print new LL
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
        if(lengthofLL == n){
            return head.next;
        }
        while (current != null){
            System.out.print(current.val);
            Currentposition += 1;
            current = current.next;
            if((lengthofLL-n-1) == 0){
                current = current.next;
                return head;
                
            }
            if (Currentposition == (lengthofLL-n-1)){
                current.next = current.next.next;
                  
                System.out.println("i");
        
            }
                
            
            
        }        
    return head;
    }
}