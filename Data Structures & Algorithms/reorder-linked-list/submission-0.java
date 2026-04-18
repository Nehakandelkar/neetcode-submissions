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
    public void reorderList(ListNode head) {
        //find mid nad last of LL
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode start1 = head;
        ListNode start2 = slow.next;

        slow.next = null;

        //reverse second half
        ListNode prev = null;
        ListNode curr = start2;

        while(curr != null){
            ListNode next = curr.next;  // store next
            curr.next = prev;           // reverse link
            prev = curr;                // move prev
            curr = next;                // move curr
        }

        start2 = prev;

        ListNode p1 = start1;
        ListNode p2 = start2;

        while(p2 != null){
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;

            p1.next = p2;
            p2.next = temp1;

            p1 = temp1;
            p2 = temp2;
        }

    }
}
