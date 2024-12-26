//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
         int n=arr.length;
        if(k>n) return -1;
        int min=0,max=0;
        for(int i=0;i<n;i++){
            min=Math.max(min,arr[i]);
            max+=arr[i];
        }
        while(min<=max){
            int mid=(min+max)/2;  
            int student=1;
            int sum=0;
            for(int i=0;i<n;i++){
                if(arr[i]+sum>mid){
                    student++;
                    sum=arr[i];
                }else{
                    sum+=arr[i];
                }
            }
            if(student<=k){
                max=mid-1;
            }else{
                min=mid+1;
            }
            
        }
        return min;
    
    }
}