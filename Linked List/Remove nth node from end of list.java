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
        // 1. Link the dummy node to the head of the list
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        
        // 2. Advance fast pointer so there is a gap of n nodes between slow and fast
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        
        // 3. Move both pointers until fast reaches the very end (null)
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // 4. Delete the nth node from the end by skipping it
        slow.next = slow.next.next;
        
        // 5. Return the actual modified head
        return dummy.next;
    }
}
