class Solution {
    // it can also be solved with topology sort
    // reverse the graph
    // then apply topology sort and store the nodes with in degree 0

    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0;i<graph.length;i++){
            for(int v : graph[i]){
                adj.get(v).add(i);
            }
        }

        List<Integer> list = new ArrayList<>();
        int[] indegree = new int[graph.length];
        Queue<Integer> q = new LinkedList<>();

        for(int i =0;i<adj.size();i++){
            for(int ele : adj.get(i)){
                indegree[ele]++;
            }
        }

        for(int i = 0;i<indegree.length;i++){
            if(indegree[i] == 0)q.offer(i);
        }

        while(!q.isEmpty()){
            int node = q.poll();

            list.add(node);

            for(int v : adj.get(node)){
                indegree[v]--;
                if(indegree[v] == 0)q.offer(v);
            }
        }

        Collections.sort(list);

        return list;
    }

}