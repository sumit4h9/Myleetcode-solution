1class Solution {
2    public boolean checkPerfectNumber(int num) {
3        if(num<=1)return false;
4
5        int sum = 0;
6        for(int i =1 ; i*i<=num;i++){
7            if(num%i==0){
8                sum +=i;
9                if(i*i!=num && i!=1){
10                    sum += num/i;
11                }
12            }
13        }
14        return sum == num;
15    }
16}