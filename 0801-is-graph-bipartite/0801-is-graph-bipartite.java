class Solution {
    public boolean DFS(int node,int col,int[][] graph,int[] color){
        color[node] = (col == 0) ? 1 : 0;

        for(int v : graph[node]){
            if(color[v] == -1){
                if(!DFS(v,color[node],graph,color))return false;
            }else if(color[v] == color[node])return false;
        }

        return true;
    }
    // using DFS:
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int m = graph[0].length;

        int[] color = new int[n];
        Arrays.fill(color,-1);

        for(int i= 0;i<n;i++){
            if(color[i] == -1){
                if(!DFS(i,0,graph,color))return false;
            }
        }

        return true;
    }
}