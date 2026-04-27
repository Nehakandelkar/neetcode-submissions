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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;

        if(n == 0) return null;

        ListNode head = lists[0];

        for(int i=1; i<n; i++){
            head = mergeTwoLists(head, lists[i]);
        }

        return head;

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2){

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode l1 = list1;
        ListNode l2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }

        while(l1 != null){
            temp.next = l1;
            l1 = l1.next;
            temp = temp.next;
        }

        while(l2 != null){
            temp.next = l2;
            l2 = l2.next;
            temp = temp.next;
        }

        return dummy.next;



    }
}
