//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases
        int T = Integer.parseInt(br.readLine());

        // Process each test case
        while (T-- > 0) {
            // Read the entire line containing the array elements
            String line = br.readLine();

            // Split the line into an array of strings, then parse them as integers
            String[] tokens = line.split("\\s+");
            int[] a = new int[tokens.length];
            for (int i = 0; i < tokens.length; i++) {
                a[i] = Integer.parseInt(tokens[i]);
            }

            // Create the Solution object
            Solution obj = new Solution();

            // Call maxLen function and print the result
            System.out.println(obj.maxLen(a));
        }
    }
}
// } Driver Code Ends


class Solution {
    public int maxLen(int[] arr) {
        // Your code here
          for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }

        // HashMap to store the first occurrence of each cumulative sum
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0; // Initialize cumulative sum
        int maxLength = 0; // Initialize max length of subarray

        // Traverse through the array
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // Update cumulative sum

            // Check if cumulative sum is zero, meaning subarray from start to this index
            if (sum == 0) {
                maxLength = i + 1;
            }

            // If cumulative sum is seen before, update maxLength
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                // Store the first occurrence of the cumulative sum
                map.put(sum, i);
            }
        }

        return maxLength;
        
    }
}
