1class Solution {
2    public int countPrimes(int n) {
3        if(n <= 2)return 0;
4
5        boolean[] isPrime = new boolean[n];
6        int limit = (int)Math.sqrt(n);
7
8        for(int i =2;i<=limit;i++){
9            if(!isPrime[i]){
10                for(int j = i*i;j<n ;j+=i){
11                    isPrime[j] = true;
12                }
13            }
14        }
15        int count = 0;
16
17        for(int i =2; i<n;i++){
18            if(!isPrime[i])count++;
19        }
20        return count;
21    }
22}