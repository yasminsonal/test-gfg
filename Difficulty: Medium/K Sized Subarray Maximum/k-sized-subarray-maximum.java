//{ Driver Code Starts
// Initial template for JAVA

import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        // taking input using class Scanner
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // taking total number of elements
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            int k = Integer.parseInt(br.readLine());
            ArrayList<Integer> res = new Solution().maxOfSubarrays(arr, k);

            // printing the elements of the ArrayList
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public ArrayList<Integer> maxOfSubarrays(int arr[], int k) {
        // code here
         ArrayList<Integer>a=new ArrayList<>();
        int n=arr.length;
        TreeMap<Integer,Integer>tm=new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<k;i++)
        tm.put(arr[i],tm.getOrDefault(arr[i],0)+1);
        a.add(tm.firstKey());
        for(int i=1;i<=n-k;i++)
        {
            if(tm.get(arr[i-1])==1)
            tm.remove(arr[i-1]);
            else
            {
                tm.put(arr[i-1],tm.get(arr[i-1])-1);
            }
            tm.put(arr[i+k-1],tm.getOrDefault(arr[i+k-1],0)+1);
            a.add(tm.firstKey());
        }
        return a;
    }
}