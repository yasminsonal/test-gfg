class Solution {
    public int countLessEqual(int[] arr, int x) {
        // code here
        int low=0;
        int high = arr.length -1;
        int count = -1;
        Arrays.sort(arr);
        while(low <= high){
            int mid = low + (high - low) /2;
            if(arr[mid] <=x){
                count = mid;
                low  = mid+1;
            }
            else{
                high = mid -1;
            }
            
        }
        return count +1;
    }
}
