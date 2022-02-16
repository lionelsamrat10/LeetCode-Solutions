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
    public ListNode swapPairs(ListNode head) {
        ListNode pointer = head;
        if(head == null){
            return head;
        } 
           if(head.next == null){
              return head;
        }
        while(pointer != null && pointer.next !=null){
            int temp = pointer.val;
            pointer.val = pointer.next.val;
            pointer.next.val = temp;

            pointer = pointer.next.next;
        }
        return head;
    }
}
