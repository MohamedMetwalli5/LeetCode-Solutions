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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode current = list1;
        int i = 0, j = 0;
        while(i <a-1 && current != null){
            current = current.next;
            i++;
        }
        
        
        
        ListNode last2 = list2;
        while(last2.next != null){
            last2 = last2.next;
        }
        ListNode current2 = list1;
        while(j <b && current2 != null){
            current2 = current2.next;
            j++;
        }
        last2.next = current2.next;
        current2.next = null;
        current.next = list2;
        
        return list1;
    }
}