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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head.next==null) return null;
14        ListNode slow = head;
15        ListNode fast = head;
16
17        while(fast.next.next!=null && fast.next.next.next!=null){
18            slow = slow.next;
19            fast = fast.next.next;
20        }
21        slow.next = slow.next.next;
22        return head;
23    }
24}