class Solution {
    public int maxProfit(int[][] jobs) {
        // code here
        int n = jobs.length;
        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[1]));
        int[] dp = new int[n];
        
        dp[0] = jobs[0][2];
        
        for(int i = 1; i < n; i++){
            int idx = search(jobs,jobs[i][0],0,i-1);
            if(idx != -1) dp[i] = Math.max(dp[i-1],jobs[i][2]+dp[idx]);
            else dp[i] = Math.max(dp[i-1], jobs[i][2]);
        }
        
        return dp[n-1];
    }
    private int search(int[][] jobs, int key, int si, int ei){
        int ans = -1;
        
        while(si <= ei){
            int mid = si + (ei-si)/2;
            
            if(jobs[mid][1] <= key){
                si = mid+1;
                ans = mid;
            }else ei = mid-1;
        }
        
        return ans;
    }
}