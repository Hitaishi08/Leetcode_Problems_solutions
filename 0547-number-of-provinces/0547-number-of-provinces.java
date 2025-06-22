class Solution {
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
                bfs(i,isConnected,visit);
                count++;
            }
        }

        return count;
    }
}