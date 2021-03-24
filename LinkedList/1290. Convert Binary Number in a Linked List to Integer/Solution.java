//Author: Samrat Mitra
//Better than 100% solutions in terms of time.
//T(n) = O(n)

class Solution {
    public int getDecimalValue(ListNode head) {
        //Get the length of the linked list first
        int len = length(head);
        int num = 0;
        int power = len-1;
        while(head != null){
            num += (head.val * (int)Math.pow(2, power--));
            //power--;
            head = head.next;
        }
        return num;
    }
    public int length(ListNode head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}
