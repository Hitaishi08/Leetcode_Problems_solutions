class Solution {
    public void dfs(int node,int[][] isConnected,int[]visit){
        visit[node] = 1;
        for(int i = 0;i<isConnected.length;i++){
            if(isConnected[node][i] == 1 && isConnected[node][i]==1 && visit[i] != 1){
                dfs(i,isConnected,visit);
            }
        }
    }
    public void bfs(int node,int[][] isConnected,int[]visit){
        int n = isConnected.length;
        visit[node] = 1;
        Queue<Integer> q = new LinkedList<>();
        q.offer(node);

        while(!q.isEmpty()){
            int v = q.poll();

            for(int i = 0;i<n;i++){
                if(isConnected[v][i] == 1 && isConnected[v][i]==1 && visit[i] != 1){
                    visit[i] = 1;
                    q.offer(i);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] visit = new int[isConnected.length];
        int count = 0;
        for(int i = 0;i<n;i++){
            if(visit[i] != 1){
                // bfs(i,isConnected,visit);
                dfs(i,isConnected,visit);
                count++;
            }
        }

        return count;
    }
}