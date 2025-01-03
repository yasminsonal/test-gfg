//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            new Solution().setMatrixZeroes(arr);
            for (int[] row : arr) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends

//Back-end complete function Template for Java
class Solution {
    public void setMatrixZeroes(int[][] mat) {
        int rl=mat.length;
        int cl=mat[0].length;
        
        int[] row=new int[rl];
        int[] col=new int[cl];
        
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(mat[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<rl;i++)
        {
            for(int j=0;j<cl;j++)
            {
                if(row[i]==1||col[j]==1)
                {
                    mat[i][j]=0;
                }
            }
        }
        
    }
}