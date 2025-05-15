//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            int target = Integer.parseInt(sc.nextLine());

            Solution ob = new Solution();
            int ans = ob.countTriplets(arr, target);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
       int n = arr.length;
        int count = 0;
       
        for (int i = 0; i < n; i++) {
            int x= i+1;
            int y=n-1;
            int z=target - arr[i];
            while(x<y){
                if(arr[x]+ arr[y] == z){
                    int right=y;
                    while(x<right && arr[right] == arr[y]){
                        count++;
                        right--;
                        
                    }
                    x++;
                }
                else if(arr[x]+arr[y]<z){
                    x++;
                }
                else{
                    y--;
                }
            }
        }
        return count;
                     
    }
}