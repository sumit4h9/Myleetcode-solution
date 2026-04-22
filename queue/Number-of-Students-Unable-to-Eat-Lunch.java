1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        Queue<Integer> q = new ArrayDeque<>();
4
5        for(int s:students){
6            q.offer(s);
7        }
8
9        int sandwitchesI = 0;
10        int rotations = 0;
11
12        while(!q.isEmpty() && rotations < q.size()){
13            if(q.peek() == sandwiches[sandwitchesI]){
14                q.poll();
15                sandwitchesI++;
16                rotations = 0;
17            }
18            else{
19                q.offer(q.poll());
20                rotations++;
21            }
22        }
23        return q.size();
24    }
25}