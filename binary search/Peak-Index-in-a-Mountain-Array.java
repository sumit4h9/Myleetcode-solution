1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int n = arr.length;
4
5        int low = 0;
6        int high = n-1;
7        int mid = 0;
8
9        while(low < high){
10            mid = low + (high - low)/2;
11            if(arr[mid]<arr[mid+1]){
12                low = mid+1;
13            }
14            else{
15                high = mid;
16            }
17        }
18
19        return low;
20    }
21}