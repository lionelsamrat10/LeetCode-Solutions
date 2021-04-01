//Not a very efficient solution, but very easy approach
//Author: Samrat Mitra
//Used Two pointer approach and used a Stack as well
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
    public boolean isPalindrome(ListNode head) {
        //Base case
        if(head == null || head.next == null) return true;
        
        ListNode fast = head;
        Stack<Integer> stk = new Stack<>();
        
        while(fast != null){
            if(fast.next == null){
                head = head.next;
                break;
            }
            stk.push(head.val);
            head = head.next;
            fast = fast.next.next;
        }
        
        while(!stk.isEmpty()){
            if(head.val != stk.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
