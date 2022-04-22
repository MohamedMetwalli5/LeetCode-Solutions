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
    public ListNode sortList(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            l.add(current.val);
            current = current.next;
        }
        
        int[] array = l.stream().mapToInt(i->i).toArray();
        Arrays.sort(array);
        current = head;
        int i=0;
        while(current != null){
            current.val = array[i];
            i++;
            current = current.next;
        }
        
        return head;
    }
}