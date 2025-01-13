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
        int maxSize = Integer.MIN_VALUE;
        int size = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        HashMap<Integer, Integer> hp = new HashMap<>();
        
        for(int num : arr) {
            hp.put(num, 0);
            smallest = Math.min(smallest, num);
            largest = Math.max(largest, num);
        }
        
        for(int i=smallest; i<=largest; i++) {
            if(hp.containsKey(i)) size++;
            else size = 0;

            maxSize = Math.max(size, maxSize);
        }
        
        return maxSize;
    }
}