//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int ans = 0;
        
        ArrayList<Integer> num = new ArrayList<>();
        ArrayList<Integer> val = new ArrayList<>();
        
        int prev = arr[0];
        int count = 1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] == prev){
                count++;
            }    
            else{
                num.add(prev);
                val.add(count);
                prev = arr[i];
                count = 1;
                
            }
        }
        
        num.add(prev);
        val.add(count);
        
        int left = 0, right = num.size() - 1;
        
        while(left < right){
            if((num.get(left) + num.get(right)) == target){
                ans += (val.get(left++) * val.get(right--));
            }
            else if((num.get(left) + num.get(right)) < target){
                left++;
            }
            else{
                right--;
            }
        }
        
        if(target % 2 == 0){
            if(num.get(left) == target/2){
                int m = val.get(left);
                ans += (int)(m * (m-1) / 2);
            }
        }
        
        return ans;
    }
}



//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends