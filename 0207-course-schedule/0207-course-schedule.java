class Solution {
    public boolean canFinish(int V, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int[] indegree = new int[V];

        for(int i =0;i<V;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            int v = prerequisites[i][0];
            int u = prerequisites[i][1];

            adj.get(v).add(u);
        }

        for(int i = 0;i<V;i++){
            for(int v : adj.get(i)){
                indegree[v]++;
            }
        }

        for(int i = 0;i<V;i++){
            if(indegree[i] == 0)q.offer(i);
        }
        int cnt = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            cnt++;

            for(int v : adj.get(node)){
                indegree[v]--;
                if(indegree[v] == 0)q.offer(v);
            }
        }

        return (cnt  < V) ? false : true;

    }
}