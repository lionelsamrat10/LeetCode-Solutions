public class RemoveNode{
	  static class ListNode
	{
	    int data;
	    ListNode next;
	};
	  
	public static ListNode removeNthFromEnd(ListNode head, int n) {   
	        int len = 0;
	        ListNode curr = head;
	        while(curr != null) {
	            len++;
	            curr = curr.next;
	        }
	        curr = head;
	        ListNode prev = null;
	        int i = 0;
	        while(curr != null) {     
	            if(i == len-n) {     
	                if(prev == null) {
	                   head = head.next;
	                }else if(curr.next != null) {
	                    prev.next = curr.next;
	                } else {
	                    prev.next = null;
	                }
	                break;
	            }
	            i++;
	            prev = curr;
	            curr = curr.next;
	        }
	        
	        return head;
	    }
	  static void print(ListNode head)
	{
	    ListNode temp = head;
	    while (temp != null)
	    {
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	    System.out.println();
	}
	  static ListNode add(ListNode head, int x)
	{
	    ListNode temp, ptr = head;
	    temp = new ListNode();
	    temp.data = x;
	    temp.next = null;
	    if (head == null)
	        head = temp;
	    else
	    {
	        while (ptr.next != null)
	        {
	            ptr = ptr.next;
	        }
	        ptr.next = temp;
	    }
	    return head;
	}
	 
	  public static void main(String[] args)
	{
	    ListNode head = null;
	     
	    head = add(head, 1);
	    head = add(head, 2);
	    head = add(head, 3);
	    head = add(head, 4);
	    head = add(head, 5);
	     
	    int n = 2;
	 
	    head = removeNthFromEnd(head, 2);
	    System.out.print("Linked list after modification: \n");
	    print(head);
	}
	}
