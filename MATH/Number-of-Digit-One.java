1class Solution {
2    public int countDigitOne(int n) {
3        long count = 0;
4
5        for(long i=1;i<=n;i*=10){
6            long divider = i * 10;
7            count += (n / divider) * i;
8
9            long reminder = n % divider;
10
11            if(reminder >=i){
12                count += Math.min(reminder - i + 1,i);
13            }
14        }
15        return (int) count;
16    }
17}