1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16        ListNode dummy = head;
17        int count = 0;
18        
19        while(fast!=null && fast.next!=null){
20            slow = slow.next;
21            fast = fast.next.next;
22
23            if (slow == fast) {
24                // Step 2: Find cycle start
25                ListNode ptr = head;
26
27                while (ptr != slow) {
28                    ptr = ptr.next;
29                    slow = slow.next;
30                }
31                return ptr;
32            }
33        }
34        return null;
35    }
36}