#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int dx[8] = {2, 1, -1, -2, -2, -1, 1, 2};
    int dy[8] = {1, 2, 2, 1, -1, -2, -2, -1};

    bool solve(int x, int y, int move, int n, vector<vector<int>> &ans) {
        // If all squares are visited
        if (move == n * n) return true;

        for (int k = 0; k < 8; k++) {
            int nx = x + dx[k];
            int ny = y + dy[k];

            // Check if the next position is valid
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && ans[nx][ny] == -1) {
                ans[nx][ny] = move;
                if (solve(nx, ny, move + 1, n, ans))
                    return true;
                ans[nx][ny] = -1; // Backtrack
            }
        }
        return false;
    }

    vector<vector<int>> knightTour(int n) {
        vector<vector<int>> ans(n, vector<int>(n, -1));
        ans[0][0] = 0; // start position

        if (solve(0, 0, 1, n, ans))
            return ans;

        return {}; // no solution
    }
};
