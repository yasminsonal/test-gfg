
class Solution {
    public String average(int arr[]) {
        // code here
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
           
           sum += arr[i];
        }
        double avg=(double) sum/n;
        return String.format("%.2f",avg);

        
    }
}