//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(mat);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int orangesRotting(int[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][m];
        int freshCount = 0;
        
        // Step 1: Add all initially rotten oranges to the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j, 0});  // [row, col, time]
                    visited[i][j] = true;
                } else if (grid[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // Directions: up, right, down, left
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int time = 0, rotted = 0;

        // Step 2: BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int x = curr[0], y = curr[1], t = curr[2];
            time = Math.max(time, t);

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx >= 0 && ny >= 0 && nx < n && ny < m &&
                    !visited[nx][ny] && grid[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny, t + 1});
                    visited[nx][ny] = true;
                    rotted++;
                }
            }
        }

        return rotted == freshCount ? time : -1;
    }
}