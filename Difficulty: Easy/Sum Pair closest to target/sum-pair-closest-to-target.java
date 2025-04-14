//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            ArrayList<Integer> array = new ArrayList<>();

            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int target = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            List<Integer> res = ob.sumClosest(arr, target);
            if (res.isEmpty()) {
                System.out.print("[]");
            } else {
                for (Integer num : res) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        List<Integer> ans = new ArrayList<>();
        
        int n = arr.length;
        
        if(n <= 1){
            return ans;
        }
        
        Arrays.sort(arr);
        
        int i = 0;
        int j = n-1;
        
        int first = -1, second = -1, min= Integer.MAX_VALUE;
        
        while(i < j){
            int diff = arr[i] + arr[j] - target;
            
            if(Math.abs(diff) < min){
                min = Math.abs(diff);
                first = arr[i];
                second = arr[j];
            }
            
            if(diff == 0){
                break;
            }
            else if(diff > 0){
                j--;
            }
            else{
                i++;
            }
        }
        
        ans.add(first);
        ans.add(second);
        
        return ans;
    }
}