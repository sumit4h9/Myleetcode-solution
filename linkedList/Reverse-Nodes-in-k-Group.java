1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseKGroup(ListNode head, int k) {
13        if (head == null) return head;
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16        ListNode prev = dummy;
17
18
19        while(true){
20            ListNode kth = prev;
21
22            for (int i = 0; i < k && kth != null; i++) {
23                kth = kth.next;
24            }
25
26            if (kth == null) break;
27
28            ListNode curr = prev.next;
29            ListNode next = curr.next;
30
31            for(int i=1; i<k; i++){
32                curr.next = next.next;
33                next.next = prev.next;
34                prev.next = next;
35                next = curr.next;
36            }
37            prev = curr;
38        }
39
40        return dummy.next;
41    }
42}