// Iterative Solution
class Solution{
    // Merges two lists with headers as h1 and h2.
    // It assumes that h1's data is smaller than
    // or equal to h2's data.
    public static ListNode mergeUtil(ListNode h1, ListNode h2){
        // if only one node in first list
        // simply point its head to second list
        if(h1.next == null){
            h1.next = h2;
            return h1;
        }
        // Initialize current and next pointers of
        // both lists
        ListNode curr1 = h1, next1 = h1.next;
        ListNode curr2 = h2, next2 = h2.next;
        
        while(next1 != null && curr2 != null){
            // If curr2 lies in between curr1 and next1
            // Then do curr1 = curr2.next
            if((curr2.val) >= (curr1.val) && (curr2.val) <= (next1.val)) {
                next2 = curr2.next;
                curr1.next = curr2;
                curr2.next = next1;
                // now let curr1 and curr2 to point
                // to their immediate next pointers
                curr1 = curr2;
                curr2 = next2;
            } else{
                // if more nodes in first list
                if (next1.next != null) {
                    next1 = next1.next;
                    curr1 = curr1.next;
                }
                // else point the last node of first list
                // to the remaining nodes of second list
                else{
                    next1.next = curr2;
                    return h1;
                }
            }
        }
        return h1;
    }
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        if (h1 == null)
            return h2;
        if (h2 == null)
            return h1;
 
        // start with the linked list
        // whose head data is the least
        if (h1.val < h2.val)
            return mergeUtil(h1, h2);
        else
            return mergeUtil(h2, h1);
    }
}
