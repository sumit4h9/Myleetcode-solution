public class Solution {

    public int[] getModifiedArray(int length, int[][] updates) {
        int[] diff = new int[length];
        for(int[] update:updates){
            int start = updates[0];
            int lastidx = updates[1];
            int inclu = update[2];

            diff[start] += inclu;
            if(lastidx +1 < n){
                diff[lastidx+1] -=inclu; 
            }
        }
        
        for(int i=1; i<n; i++){
            diff[i]+=diff[i-1];    
        }
        return diff;
    }
}
