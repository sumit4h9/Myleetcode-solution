1class MyCircularQueue {
2    private int[] q;
3    private int front,size,capacity;
4    public MyCircularQueue(int k) {
5        this.q = new int[k];
6        this.front = 0;
7        this.size = 0;
8        this.capacity = k;
9    }
10    
11    public boolean enQueue(int value) {
12        if(isFull()) return false;
13        q[(front + size) % capacity] = value;
14        size++;
15        return true;
16    }
17    
18    public boolean deQueue() {
19        if(isEmpty()) return false;
20        front = (front + 1) % capacity;
21        size--;
22        return true;
23    }
24    
25    public int Front() {
26        return isEmpty() ? -1: q[front];
27    }
28    
29    public int Rear() {
30        if (isEmpty()) return -1;
31        return q[(front + size - 1) % capacity];
32    }
33    
34    public boolean isEmpty() {
35        return size == 0;
36    }
37    
38    public boolean isFull() {
39        return size == capacity;
40    }
41}
42
43/**
44 * Your MyCircularQueue object will be instantiated and called as such:
45 * MyCircularQueue obj = new MyCircularQueue(k);
46 * boolean param_1 = obj.enQueue(value);
47 * boolean param_2 = obj.deQueue();
48 * int param_3 = obj.Front();
49 * int param_4 = obj.Rear();
50 * boolean param_5 = obj.isEmpty();
51 * boolean param_6 = obj.isFull();
52 */