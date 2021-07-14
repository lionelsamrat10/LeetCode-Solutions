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
    /*public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }*/
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        ListNode dummyNode = head;
        
        while(dummyNode.next != null) {
            if(dummyNode.next.val == val) dummyNode.next = dummyNode.next.next;
            else dummyNode = dummyNode.next;
        }
        if(head.val == val) return head.next;
        else return head;
    }
}
