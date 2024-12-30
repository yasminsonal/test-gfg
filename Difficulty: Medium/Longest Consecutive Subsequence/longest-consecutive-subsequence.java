//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // Read first array
            String input = br.readLine();
            String[] inputArray = input.split(" ");
            int[] arr = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();

            Solution ob = new Solution();
            int res = ob.longestConsecutive(arr);

            System.out.println(res);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int maxi=0;
        int n=arr.length;
        int l=0;
        int r=0;
        int cnt=0;
        Set<Integer> hash=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            hash.add(arr[i]);
        }
        Integer[] arr1=hash.toArray(new Integer[0]);
        Arrays.sort(arr1);
        while(r<arr1.length)
        {
            if(arr1[r]-arr1[l]!=r-l)
            {
                l++;
            }
            if(arr1[r]-arr1[l]==r-l)
            {
                maxi=Math.max(maxi,r-l);
            }
            r++;
        }
        return maxi+1;
    }
}