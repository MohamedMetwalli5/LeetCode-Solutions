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
    int size = 0;
    private List<Integer> l = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp = new ListNode();
        temp = head;
        while(temp != null){
            l.add(temp.val);
            temp = temp.next;
            size++;
        }
    }
    
    public int getRandom() {
        return l.get(new Random().nextInt(l.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */