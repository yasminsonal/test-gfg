class Solution {
    public int countAtMostK(int arr[], int k) {
        // code here
        int n=arr.length;
        int l=0, count=0;
        
        Map<Integer, Integer> map= new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            while(map.size()>k){
                map.put(arr[l], map.get(arr[l])-1);
               if(map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
            }
            l++;
        }
        if(map.size() > 0 && map.size() <= k) {
                count += i - l +1;
            }
        }
        return count;
    }
}
