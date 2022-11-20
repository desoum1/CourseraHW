/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        //treat it like a race track, eventually fast will catch up in a looped track.
        while (fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
            
        }
        return false;
    }
}