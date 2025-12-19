class Solution {
    public static double posAverage(int[] arr) {
        // Code here
        int n=arr.length;

        double sum=0.0;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i] >=0){
                count++;
                sum += arr[i];
            }
        }
        return (sum/count);
    }
}
