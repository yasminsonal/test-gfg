//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        if(arr.length==1){
            return arr[0];
        }
        int size=arr.length/2;
        for(int i=0;i<arr.length-1;i++){
            int temp=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    temp++;
                    if(temp>=size){
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }
}