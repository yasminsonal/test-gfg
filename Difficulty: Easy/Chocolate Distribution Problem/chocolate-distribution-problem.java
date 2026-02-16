// User function Template for Java
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int start=0;
        int end=m-1;
        int ans=Integer.MAX_VALUE;
        
        while(end<arr.size()){
            ans=Math.min(ans, arr.get(end) - arr.get(start));
            start++;
            end++;
        }
        return ans;
    }
}