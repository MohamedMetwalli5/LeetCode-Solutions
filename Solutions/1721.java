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
    public ListNode swapNodes(ListNode head, int k) {
         if(head.next == null){
            return head;
        }
        
        ListNode current = head, first = head, second = head;
        int i = 1;
        while(current != null){
            if(i == k){
                first = current;
            }
            i++;
            current = current.next;
        }
        
        int j = 1;
        current = head;
        while(current != null){
            if(j == i-k){
                int temp = current.val;
                current.val = first.val;
                first.val = temp;
                break;
            }
            current = current.next;
            j++;
        }
        
        return head;
    }
}