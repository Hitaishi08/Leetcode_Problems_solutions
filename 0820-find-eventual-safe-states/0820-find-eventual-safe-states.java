class Solution {
    public boolean DFS(int node,int[][] graph,int[] visit,int[] path){
        visit[node] = 1;
        path[node] = 1;

        for(int v : graph[node]){
            if(visit[v] == 0){
                if(DFS(v,graph,visit,path))return true;
            }else if(path[v] == 1)return true;
        }

        path[node] = 0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        int[] visit = new int[n];
        int[] path = new int[n];

        for(int i = 0;i<n;i++){
            if(visit[i] == 0){
                DFS(i,graph,visit,path);
            }
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<n;i++){
            if(path[i] == 0)list.add(i);
        }

        return list;
    }
}