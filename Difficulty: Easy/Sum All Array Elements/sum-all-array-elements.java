class Solution {
    public static int arraySum(int[] arr) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}