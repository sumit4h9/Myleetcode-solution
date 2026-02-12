1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int low = 1;
13        int high = n;
14
15        while(low<=high){
16            int mid = low + (high - low)/2;
17
18            int result = guess(mid);
19            if(result == 0){
20                return mid;
21            }
22            else if(result == 1){
23                low = mid +1;
24            }
25            else{
26                high = mid -1;
27            }
28        }
29        return -1;
30    }
31}