1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        int n = tickets.length;
4        int time = 0;
5
6        Queue<Integer> q = new ArrayDeque<>();
7        for(int i=0; i < tickets.length; i++){
8            q.offer(i);
9        }
10        
11        while(!q.isEmpty()){
12            int person = q.poll(); 
13            tickets[person]--;         
14            time++;   
15
16            if(tickets[k] == 0 && person == k){
17                return time;
18            }
19            if(tickets[person] > 0){
20                q.offer(person);
21            }
22        }
23        return time;
24    }
25}