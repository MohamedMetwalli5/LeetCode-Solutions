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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        
        ListNode current = head;
        int i = 0;
        while(current != null){
            i++;
            current = current.next;
        }
        
        int j = 0;
        current = head;
        while(current != null){
            if(j == (i/2)-1){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
            j++;
        }
        
        return head;
    }
}