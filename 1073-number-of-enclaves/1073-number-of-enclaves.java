class Solution {
    static class Pair<V,U>{
        V first;
        U second;

        Pair(V first,U second){
            this.first = first;
            this.second = second;
        }
    }

    public static int[] dir1 = {-1,1,0,0};
    public static int[] dir2 = {0,0,1,-1};

    public static void BFS(int[][] grid,Queue<Pair<Integer,Integer>> q,int[][] visit){

        while(!q.isEmpty()){
            Pair<Integer,Integer> data = q.poll();
            int row = data.first;
            int col = data.second;

            for(int i = 0;i<4;i++){
                int ii = row + dir1[i];
                int jj = col + dir2[i];

                if(ii >= 0 && ii < grid.length && jj >= 0 && jj < grid[0].length && visit[ii][jj] != 1 && grid[ii][jj] == 1){
                    visit[ii][jj] = 1;
                    q.offer(new Pair<>(ii,jj));
                }
            }
        }
    }
    public int numEnclaves(int[][] grid) {
       int[][] visit = new int[grid.length][grid[0].length];

        Queue<Pair<Integer,Integer>> q = new LinkedList<>();

        for(int i = 0;i<grid.length;i++){
            for(int j = 0 ;j<grid[0].length;j++){
                if((i == 0 || i == grid.length-1 || j == 0 || j == grid[0].length - 1) && grid[i][j] == 1){
                    visit[i][j] = 1;
                    q.offer(new Pair<>(i,j));
                }
            }
        }

        BFS(grid,q,visit);

        int cnt = 0;

        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == 1 && visit[i][j] != 1){
                    cnt++;
                }
            }
        }

        return cnt;

    }
}