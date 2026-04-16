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
    public ListNode reverseList(ListNode head) {
        
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode prev = null;
        ListNode cur = head;
        ListNode nextNode = cur.next;

        while(nextNode != null){
            cur.next = prev;
            prev = cur;
            cur = nextNode;
            nextNode = nextNode.next;
        }

        cur.next = prev;

        return cur;

        

    }
}
