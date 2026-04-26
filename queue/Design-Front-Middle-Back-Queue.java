1class FrontMiddleBackQueue {
2
3    Deque<Integer> left;
4    Deque<Integer> right;
5
6    public FrontMiddleBackQueue() {
7        left = new ArrayDeque<>();
8        right = new ArrayDeque<>();
9    }
10
11    private void balance() {
12        if (left.size() > right.size()) {
13            right.addFirst(left.removeLast());
14        } else if (right.size() > left.size() + 1) {
15            left.addLast(right.removeFirst());
16        }
17    }
18    
19    public void pushFront(int val) {
20        left.addFirst(val);
21        balance();
22    }
23    
24    public void pushMiddle(int val) {
25        if (left.size() == right.size()) {
26            right.addFirst(val);
27        } else {
28            left.addLast(val);
29        }
30    }
31    
32    public void pushBack(int val) {
33        right.addLast(val);
34        balance();
35    }
36    
37    public int popFront() {
38        if (isEmpty()) return -1;
39        int val = left.isEmpty() ? right.removeFirst() : left.removeFirst();
40        balance();
41        return val;
42    }
43    
44    public int popMiddle() {
45        if (isEmpty()) return -1;
46        int val;
47        if (left.size() == right.size()) {
48            val = left.removeLast();
49        } else {
50            val = right.removeFirst();
51        }
52        balance();
53        return val;
54    }
55    
56    public int popBack() {
57        if (isEmpty()) return -1;
58        int val = right.removeLast();
59        balance();
60        return val;
61    }
62    private boolean isEmpty() {
63        return left.isEmpty() && right.isEmpty();
64    }
65
66}
67
68/**
69 * Your FrontMiddleBackQueue object will be instantiated and called as such:
70 * FrontMiddleBackQueue obj = new FrontMiddleBackQueue();
71 * obj.pushFront(val);
72 * obj.pushMiddle(val);
73 * obj.pushBack(val);
74 * int param_4 = obj.popFront();
75 * int param_5 = obj.popMiddle();
76 * int param_6 = obj.popBack();
77 */