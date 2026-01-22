1import java.util.ArrayList;
2
3class Solution {
4    public int minimumPairRemoval(int[] nums) {
5        ArrayList<Integer> list = new ArrayList<>();
6        for (int num : nums) list.add(num);
7
8        int ops = 0;
9
10        while (!isNonDecreasing(list)) {
11            int minSum = Integer.MAX_VALUE;
12            int idx = 0;
13
14            // find leftmost minimum sum pair
15            for (int i = 0; i < list.size() - 1; i++) {
16                int sum = list.get(i) + list.get(i + 1);
17                if (sum < minSum) {
18                    minSum = sum;
19                    idx = i;
20                }
21            }
22
23            // replace pair with their sum
24            list.remove(idx + 1);
25            list.set(idx, minSum);
26            ops++;
27        }
28
29        return ops;
30    }
31
32    private boolean isNonDecreasing(ArrayList<Integer> list) {
33        for (int i = 1; i < list.size(); i++) {
34            if (list.get(i) < list.get(i - 1)) {
35                return false;
36            }
37        }
38        return true;
39    }
40}
41