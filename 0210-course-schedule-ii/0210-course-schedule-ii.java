class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i = 0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0;i<prerequisites.length;i++){
            int v = prerequisites[i][0];
            int u = prerequisites[i][1];

            adj.get(u).add(v);
        }

        int[] indegree = new int[numCourses];

        for(int i = 0;i<prerequisites.length;i++){
            int v = prerequisites[i][0];
            indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<numCourses;i++){
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

        if(list.size() < numCourses)return new int[0];

        int[] ans = new int[list.size()];

        for(int i = 0;i<list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;

    }
}