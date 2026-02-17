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
16        while(curr!=null){
17            next = curr.next;
18            curr.next = prev;
19            prev = curr;
20            curr = next;
21        }
22        return prev;
23    }
24    public boolean isPalindrome(ListNode head) {
25        ListNode slow = head;
26        ListNode fast = head;
27
28        while(fast.next!=null && fast.next.next!=null){
29            slow = slow.next;
30            fast = fast.next.next;
31        }
32        ListNode temp = reverse(slow.next);
33        slow.next = temp;
34        ListNode p1 = head;
35        ListNode p2 = slow.next;
36        while(p2!=null){
37            if(p1.val==p2.val){
38                p1=p1.next;
39                p2=p2.next;
40            }
41            else{
42                return false;
43            }
44        }
45        return true;
46    }
47}