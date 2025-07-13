class Solution {
    public void dfs(int node,int[] visit,List<List<Integer>> rooms){
        visit[node] = 1;

        for(int v : rooms.get(node)){
            if(visit[v] != 1){
                dfs(v,visit,rooms);
            }
        }
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int[] visit = new int[rooms.size()];
        
        
        dfs(0,visit,rooms);

        for(int i=0;i<rooms.size();i++){
            if(visit[i] != 1)return false;
        }

        return true;
    }
}