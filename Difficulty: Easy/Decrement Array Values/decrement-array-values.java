class Solution {
    public static int[] decrementArrayElements(int[] arr) {
        // Code here
        int n=arr.length;
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr1[i] = arr[i] -1;
        }
        return arr1;
    }
}