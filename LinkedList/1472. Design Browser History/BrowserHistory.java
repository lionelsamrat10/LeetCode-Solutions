//  Author - Vaibhav Singh
//  Using Doubly Linked List
// Time Complexity - O(n)


class BrowserHistory {

    static class Node {
        String url;
        Node next;
        Node prev;
        
        Node(String url) {
            this.url = url;
            this.next = null;
            this.prev = null;
        }
    }
    
    Node cur = null;
    
    public BrowserHistory(String homepage) {
        cur = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        newNode.prev = cur;
        cur.next = newNode;
        cur = cur.next;
    }
    
    public String back(int steps) {
        while(steps != 0 && cur.prev != null) {
            cur = cur.prev;
            steps--;
        }
        
        return cur.url;
    }
    
    public String forward(int steps) {
        while(steps != 0 && cur.next != null) {
            steps--;
            cur = cur.next;
        }
        
        return cur.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */