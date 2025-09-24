class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        boolean vis[]= new boolean[V];
        boolean rec[] =new boolean [V];
        for(int i=0;i<V;i++){
            if(vis[i]==false){
                if(dfs(i,adj,vis,rec)){
                    return true;
                }
            }
        }
        return false; 
             
    }
    public boolean dfs(int src,ArrayList<ArrayList<Integer>> adj,boolean vis[], boolean rec[] ){
        vis[src]=true;
        rec[src]=true;
        for(int i=0;i<adj.get(src).size();i++){
            int b= adj.get(src).get(i);
            if(vis[b]==false){
                if(dfs(b,adj,vis,rec)){
                   return true; 
                }
                
            }
            else if(rec[b]==true){
                return true;
            }
            
        }
        rec[src]=false;
        return false;
    }
}