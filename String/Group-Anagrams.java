1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String , List<String>> map = new HashMap<>();
4
5        for( String str:strs){
6            
7            char[] chars = str.toCharArray();
8
9            Arrays.sort(chars);
10
11            String key = new String(chars);
12
13            if(!map.containsKey(key)){
14                map.put(key, new ArrayList<>());
15            }
16
17            map.get(key).add(str);
18        }
19        return new ArrayList<>(map.values());
20
21    }
22}