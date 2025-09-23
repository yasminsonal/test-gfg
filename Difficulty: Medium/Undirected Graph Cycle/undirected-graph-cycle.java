class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        boolean[] vis = new boolean[V];
        List<List<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (dfs(i, -1, vis, adj) == true) return true;
            }
        }
        return false;
    }
    
    private boolean dfs(int src, int parent, boolean[] vis, List<List<Integer>> adj) {
        vis[src] = true;
        for (int adjNode : adj.get(src)) {
            if (!vis[adjNode]) {
                if (dfs(adjNode, src, vis, adj)) return true;
            } else if (adjNode != parent) return true;
        }
        return false;
    }
}