class Solution {
    public static boolean DFS(int node,int parent,int col,int[] visit,int[] color,List<List<Integer>> adj){
        visit[node] = 1;
        color[node] = col;

        for(int v : adj.get(node)){
            if(visit[v] != 1){
                int newcol = (col == 1) ? 2 : 1;
                if(!DFS(v,node,newcol,visit,color,adj)){
                    return false;
                }
            }else if(color[v] == color[node]){
                return false;
            }
        }

        return true;
    }
    public boolean isBipartite(int[][] graph) {
        List<List<Integer>> adj = new ArrayList<>();

        // for(int i = 0;i<graph.length;i++){
        //     adj.add(new ArrayList<>());
        // }

        // for(int i = 0;i<graph.length;i++){
        //     for(int j = 0;j<graph[i].length;j++){
        //         adj.get(i).add(graph[i][j]);
        //     }
        // }

        for (int i = 0; i < graph.length; i++) {
            adj.add(new ArrayList<>());
            for (int j : graph[i]) {
                adj.get(i).add(j);
            }
        }

        int[] visit = new int[graph.length];
        int[] color = new int[graph.length];

        for(int i = 0;i<graph.length;i++){
            if(visit[i] != 1){
                if(!DFS(i,-1,1,visit,color,adj))return false;
            }
        }

        return true;
    }
}