class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int l=0;
        int currentSum=0;
        int res=0;
        
        for(int R=0;R<arr.length;R++){
            currentSum += arr[R];
            
            if(R-l+1 ==k){
                res = Math.max(res, currentSum);
                currentSum -= arr[l];
                l++;
            }
        }
        return res;
        
    }
}