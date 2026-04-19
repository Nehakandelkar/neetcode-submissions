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
        //find length of LL
        ListNode temp = head;

        int k = 0;

        while(temp != null){
            k+=1;
            temp = temp.next;
        }

        int len = k-n;

        if (n == k) {
            return head.next;
        }

        ListNode cur = head;
        for (int i = 1; i < len; i++) {
            cur = cur.next;
        }

        cur.next = cur.next.next;


        return head;







    }
}
