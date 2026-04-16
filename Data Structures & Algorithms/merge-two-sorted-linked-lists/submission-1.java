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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        List<Integer> res = new ArrayList<>();

        while(temp1 != null){
            res.add(temp1.val);
            temp1 = temp1.next;
        }

        while(temp2 != null){
            res.add(temp2.val);
            temp2 = temp2.next;
        }

        int n = res.size();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = res.get(i);
        }

        Arrays.sort(arr);

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for(int i=1; i<n; i++){
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            temp = temp.next;
            
        }

        return head;



    }
}