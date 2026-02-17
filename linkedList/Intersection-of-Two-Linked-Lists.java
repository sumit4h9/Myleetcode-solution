1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }    
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14
15        if (headA == null || headB == null) return null;
16
17        ListNode tempA = headA;
18        ListNode tempB = headB;
19
20        int lengthA = 0 ;
21        while(tempA!=null){
22            lengthA++;
23            tempA = tempA.next;
24        }
25        tempA = headA;
26        int lengthB = 0;
27        while(tempB!=null){
28            lengthB++;
29            tempB = tempB.next;
30        }
31        tempB = headB;
32        if(lengthA > lengthB){
33            int steps = lengthA - lengthB;
34            for(int i=0; i<steps; i++){
35                tempA = tempA.next;
36            }
37
38        }else{
39            int steps = lengthB - lengthA;
40            for(int i=0; i<steps; i++){
41                tempB = tempB.next;
42            }
43        }
44
45        while(tempA!=tempB){
46            tempA = tempA.next;
47            tempB = tempB.next;
48        }
49
50        return tempA;
51    }
52}