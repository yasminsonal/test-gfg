//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume newline
        while (t-- > 0) {
            String input = sc.nextLine();
            String[] numbers = input.split(" ");
            int[] arr = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                arr[i] = Integer.parseInt(numbers[i]);
            }

            Solution ob = new Solution();
            String ans = ob.findLargest(arr);
            System.out.println(ans);
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    String findLargest(int[] arr) {
        // code here
        int n=arr.length;
        if(n==0){
            return "0";
        }
        String[] arr1=new String[arr.length];
        for(int i=0;i<n;i++)
        {
            arr1[i]=String.valueOf(arr[i]);
        }
        Arrays.sort(arr1,(a,b)->(b+a).compareTo(a+b));
        
        if(arr1[0].equals("0")){
            return "0";
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++)
        {
            sb.append(arr1[i]);
        }
        return sb.toString();
    }
}