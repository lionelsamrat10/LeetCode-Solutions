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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) return head;
        ListNode root = new ListNode(-1);
        root.next = head;
        int count = countNodes(head);
        int reverseCount = count / k;
        ListNode node = root;
        while (reverseCount > 0) {
            node = reverse(node, k);
            reverseCount--;
        }

        return root.next;
    }
    public ListNode reverse(ListNode node, int k) {
        ListNode curr = node.next;
        ListNode tail = null;
        ListNode reversed = null;

        while (k > 0 && curr != null) {
            ListNode newNode = curr.next;
            curr.next = reversed;
            reversed = curr;
            curr = newNode;
            if (reversed.next == null) tail = reversed;

            k--;
        }

        tail.next = curr;
        node.next = reversed;

        return tail;
    }

    public int countNodes(ListNode node) {
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }

        return count;
    }
}
