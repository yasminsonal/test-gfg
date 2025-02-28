//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M));
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n=mat.length;
        List<Integer> x=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean a =true;
            for(int j=0;j<n;j++){
                if(i==j) 
                continue;
                if(mat[i][j] == 1){
                    a=false;
                    break;
                }
            }
            if(a) {
                x.add(i);
            }
        }
        if(x.size() !=1)
        return -1;
        int ans=x.get(0);
        for(int i=0;i<n;i++){
            if(ans != i && mat[i][ans]==0)
            return -1;
        }
        return ans;
    }
}