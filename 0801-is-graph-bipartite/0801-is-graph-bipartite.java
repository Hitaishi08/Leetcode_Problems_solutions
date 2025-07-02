class Solution {
    public boolean BFS(int node,int[]visit,int[][] graph,char[] color){
        Queue<Integer> q = new LinkedList<>();

        visit[node] = 1;
        q.offer(node);
        color[node] = 'Y';

        while(!q.isEmpty()){
            int v = q.poll(); 

            char currcol  = (color[v] == 'Y') ? 'G' : 'Y';

            for(int ele : graph[v]){
                if(visit[ele] != 1){
                    color[ele] = currcol;
                    visit[ele] = 1;
                    q.offer(ele);
                }else if(color[ele] == color[v])return false;
            }       
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visit = new int[n];
        char color[] = new char[n];

        for(int i = 0;i<n;i++){
            if(visit[i] != 1){
                if(!BFS(i,visit,graph,color)){
                    return false;
                }
            }
        }

        return true;
    }
}