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
    public int pairSum(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode current = head;
        while(current != null){
            l.add(current.val);
            current = current.next;
        }
        
        int max = Integer.MIN_VALUE, n = l.size();
        for(int i=0;i<=(n/2)-1;i++){
            if(l.get(i)+l.get(n-i-1) > max){
                max = l.get(i)+l.get(n-i-1);
            }
        }
        
        return max;
    }
}