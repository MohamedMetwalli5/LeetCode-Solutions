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
    public ListNode insertionSortList(ListNode head) {
        if( head == null || head.next == null){
			return head;
		}
		
		ListNode helperHead = new ListNode(Integer.MAX_VALUE);
		ListNode next = null;
        ListNode current = head;
		ListNode previous = helperHead;
		while( current != null ){
			next = current.next;
			while((previous.next != null) && (previous.next.val < current.val)){
				previous = previous.next;
			}
			current.next = previous.next;
			previous.next = current;
            current = next;
			previous = helperHead;
		}
		
		return helperHead.next;
    }
}