class Solution {
    class Pair<U,V>{
        U first;
        V second;

        Pair(U first,V second){
            this.first = first;
            this.second = second;
        }
    }
    public boolean BFS(int node,int[][]graph,int[] visit,char[] color){
        visit[node] = 1;

        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(node,-1));
        color[node] = 'Y';

        while(!q.isEmpty()){
            Pair<Integer,Integer> data = q.poll();

            int v = data.first;
            int parent = data.second;

            char col = color[v];

            char newcol = (col == 'Y') ? 'G' : 'Y';

            for(int ele : graph[v]){
                if(visit[ele] != 1){
                    q.offer(new Pair<>(ele,v));
                    color[ele] = newcol;
                    visit[ele] = 1;
                }else if(color[ele] == color[v]){
                        return false;
                    
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visit = new int[n];
        char[] color = new char[n];

        for(int i = 0;i<n;i++){
            if(visit[i] != 1){
                if(!BFS(i,graph,visit,color)){
                    return false;
                }
            }
        }

        return true;
    }
}