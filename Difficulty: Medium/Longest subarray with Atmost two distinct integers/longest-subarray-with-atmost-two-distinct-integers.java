class Solution {
    public int totalElements(int[] arr) {
        // code here
         java.util.HashMap<Integer, Integer> map= new java.util.HashMap<>();
         
         int left=0;
       int maxLen=0;
        for(int right=0; right<arr.length; right++){
            map.put(arr[right], map.getOrDefault(arr[right],0)+1);
            
            while(map.size()>2){
                 map.put(arr[left], map.get(arr[left]) - 1); 
                if(map.get(arr[left])==0){
                    map.remove(arr[left]);
                }
                left++;
            }
            maxLen= Math.max(maxLen,right - left +1);
        }
        return maxLen;
    }
}