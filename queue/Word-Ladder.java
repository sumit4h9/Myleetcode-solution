1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        
4        Set<String> set = new HashSet<>(wordList);
5        if(!set.contains(endWord))return 0;
6
7        Queue<String> q = new ArrayDeque<>();
8        q.offer(beginWord);
9
10        int level = 1;
11
12        while(!q.isEmpty()){
13            int size = q.size();
14
15            for(int i = 0; i<size; i++){
16                String word = q.poll();
17
18                if(word.equals(endWord))return level;
19
20                char[] arr = word.toCharArray();
21
22                for(int j = 0; j < arr.length; j++){
23                    char original = arr[j];
24
25                    for(char c = 'a'; c <= 'z'; c++){
26                        arr[j] = c;
27
28                        String newword = new String(arr);
29                        if(set.contains(newword)){
30                            q.offer(newword);
31                            set.remove(newword);
32                        }
33                    } 
34                    arr[j] = original;
35                }
36            }
37            level++;
38        }
39        return 0;
40    }
41}