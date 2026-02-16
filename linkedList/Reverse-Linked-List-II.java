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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if (head == null || left == right) return head;
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16        ListNode prev = dummy;
17
18        for(int i=1; i <left; i++){
19            prev = prev.next;
20        }
21        ListNode curr = prev.next;
22
23        // while(curr<right){
24        //     int next = curr.next;
25        //     curr.next = prev;
26        //     prev = curr;
27        //     curr = next;
28        // }
29
30        for(int i=0; i<right - left; i++){
31            ListNode next = curr.next;
32            curr.next = next.next;
33            next.next = prev.next;
34            prev.next = next;
35        }
36
37        return dummy.next;
38    }
39}