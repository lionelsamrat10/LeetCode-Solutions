/**
  Author: Vaibhav Singh
  Time Complexity : O(n*k)
  where n -> Size of the linked List
  and k -> Size of the array
 */


class Solution {
    
    public int findLength(ListNode head) {
        ListNode tmp = head;
        int size = 0;
        
        while(tmp != null) {
            size++;
            tmp = tmp.next;
        }
        
        return size;
    }
    
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode node[] = new ListNode[k];
        int size = findLength(head);
        
        for(int i=0;i<k && head!=null;i++) {
            ListNode cur = head;
            ListNode tmp = cur;
            int l = 0;
            int left = k-i;
            
            if(size > k-i) {
                l = size / left;
                if(size%left > 0) l++;
            } else {
                l = 1;
            }
            size -= l;
            
            ListNode prev = null;
            while(l>0 && tmp!=null) {
                l--;
                prev = tmp;
                tmp = tmp.next;
            }
            prev.next = null;
            node[i] = cur;
            head = tmp;
        }
        
        return node;
    }
}



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