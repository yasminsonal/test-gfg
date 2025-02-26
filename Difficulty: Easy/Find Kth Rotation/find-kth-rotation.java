//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int n=arr.size();
        if(n<=1){
            return 0;
        }
        if(arr.get(n-1)>arr.get(0)){
            return 0;
        }
        int start=0;
        int end=n-1;
        
        int mid=start+(end-start)/2;
        
        while(start<=end){
            if(arr.get(mid) >= arr.get(start)){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=start+(end-start)/2;
        }
        if(start >=n){
            start=n-1;
        }
        while(arr.get(start)>arr.get(start-1)){
            start--;
            
        }
        return start;
    }
}