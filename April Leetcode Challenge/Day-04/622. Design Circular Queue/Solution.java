class MyCircularQueue {
    //Declare the global variables
    int[] queue = null;
    int front = 0, rear = 0;
    //Checks whether there is no element or not
    boolean flag;
    
    public MyCircularQueue(int k) {
        queue = new int[k];
        this.flag = true;
    }
    
    public boolean enQueue(int value) {
        if(!this.isFull()){
            this.flag = false;
            queue[rear] = value;
            rear++;
            rear = rear % queue.length;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean deQueue() {
        if(!this.isEmpty()){
            front++;
            front = front % queue.length;
            if(front == rear) this.flag = true;
            return true;
        }
        else{
            return false;
        }
    }
    
    public int Front() {
        if(!this.isEmpty()){
            return queue[front];
        }
        else{
            return -1;
        }
    }
    
    public int Rear() {
        if(!this.isEmpty()){
            if(rear == 0){
              return queue[queue.length - 1];  
            }
            else{
                return queue[rear - 1];
            }
        }
        else{
            return -1;
        }
    }
    
    public boolean isEmpty() {
        return this.flag;
    }
    
    public boolean isFull() {
        return (rear == front) && !this.flag;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
