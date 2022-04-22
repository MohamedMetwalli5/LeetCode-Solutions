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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
           return null;
        }
        
        ListNode current = head;
        int i = 0;
        while(current != null){
            i++;
            current = current.next;
        }
        
        if(i-n == 0){
            head = head.next;
            return head;
        }
        
        int j = 0;
        current = head;
        while(current != null){
            if(j == i-n-1){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
            j++;
        }
        
        return head;
    }
}