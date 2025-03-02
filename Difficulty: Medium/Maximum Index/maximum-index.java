//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine().trim());

        while (t-- > 0) {
            String line = scanner.nextLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxIndexDiff(nums));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    // Function to find the maximum index difference.
    int maxIndexDiff(int[] arr) {
        // Your code here
        int n=arr.length;
        int res=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.isEmpty() || arr[st.peek()] >= arr[i])
            {
                st.push(i);
            }
        }
        for(int i=n-1 ;i>=0;i--)
        {
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                int ind=st.pop();
                res=Math.max(res,i-ind);
            }
        }
        return res;
    }
}