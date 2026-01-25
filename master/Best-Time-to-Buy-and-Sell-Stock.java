1class Solution {
2    public int maxProfit(int[] prices) {
3        int n=prices.length;
4        if(n<=1) return 0;         
5
6        int left = 0;
7        int right = 1;
8        int Max_profit = 0;
9
10        while(right < n){
11            if( prices[right] > prices[left] ){
12                int profit = prices[right] - prices[left];
13                Max_profit = Math.max(Max_profit , profit);
14            }
15            else{
16                left=right;
17            }
18            right++;
19        }
20        return Max_profit;
21    }
22}