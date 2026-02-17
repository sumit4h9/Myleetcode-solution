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
12    public ListNode reverse(ListNode head){
13        ListNode prev = null;
14        ListNode curr = head;
15        ListNode next = null;
16
17        while(curr!=null){
18            next = curr.next;
19            curr.next = prev;
20            prev = curr;
21            curr = next;
22        }
23        return prev;
24    }
25    public void reorderList(ListNode head) {
26        ListNode slow = head;
27        ListNode fast = head;
28
29        while(fast.next!=null && fast.next.next!=null){
30            slow = slow.next;
31            fast = fast.next.next;
32        }
33        ListNode second = reverse(slow.next);
34        slow.next = null;
35        ListNode first = head;
36
37        while(second!=null){
38            ListNode temp1 = first.next;
39            ListNode temp2 = second.next;
40
41            first.next = second;
42            second.next = temp1;
43
44            first = temp1;
45            second = temp2;
46        }
47    }
48}