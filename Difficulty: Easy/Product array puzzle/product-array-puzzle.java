//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob = new Solution();
            int[] ans = new int[n];
            ans = ob.productExceptSelf(arr);

            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
            System.out.println("~");
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int n = arr.length;
        int[] ans = new int[n];
        int[] pf = new int[n];
        pf[0] = 1;
        for(int i =1;i < n; i++){
            pf[i] = arr[i-1]*pf[i-1];
        }
        int[] sf = new int[n];
        sf[n-1] = 1;
        for(int i = n-2; i >=0; i--){
            sf[i] = sf[i+1]*arr[i+1];
        }
        ans[0] = sf[0];
        ans[n-1] = pf[n-1];
        for(int i =1; i < n-1; i++){
            ans[i] = pf[i]*sf[i];
        }
        return ans;

    }
}
