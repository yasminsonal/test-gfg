class Solution {
    public boolean stringStack(String pat, String tar) {
        // code here
        int n = pat.length();
        int m = tar.length();
        
        if(m > n) return false;
        if(m == n) return pat.equals(tar);
       
        char ch = tar.charAt(0);
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            if(pat.charAt(i) == ch){
                if((!hs.contains(i-1) || !hs.contains(i-2))) list.add(i);
                hs.add(i);
            }
        }
        
        for(int i = 0; i < list.size(); i++){
            int idx = list.get(i);
            if(n-idx >= m){
                if(check(pat,tar,idx,n,m)) return true;
            }
        }
        
        return false;
    }
    private boolean check(String pat, String tar, int idx, int n, int m){
        int j = 0;
        int prev = 0;
        for(int i = idx; i < n && j < m; i++){
            char ch = tar.charAt(j);
            if(ch != pat.charAt(i)) i++;
            else j++;
            prev = i;
        }
        
        if(j >= m) return (n-prev-1)%2 == 0;
        
        return false;
    }
}
