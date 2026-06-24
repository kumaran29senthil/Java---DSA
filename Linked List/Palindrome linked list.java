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
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public ListNode middleLink(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode middle = middleLink(head);
        ListNode secondhalf = reverse(middle);
        ListNode first = head;
        ListNode second = secondhalf;
        boolean palindrome = true; 
        while(second!=null){
            if(first.val!=second.val){
                palindrome=false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        return palindrome==true;
    }
}
