class Solution {
    public void deleteNode(ListNode node) {
        //Check for empty list
        if(node == null) return;
        //if last node, then can't delete as well
        if(node.next == null) return;
        
        ListNode temp = node.next;
        
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

//Better than 100% Solutions
