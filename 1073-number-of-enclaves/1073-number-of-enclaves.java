class Solution {
    private static int[] dir1 = {-1,1,0,0};
    private static int[] dir2 = {0,0,1,-1};

    private static void DFS(int row,int col,int[][] grid,int[][] visit){
        visit[row][col] = 1;

        for(int i = 0;i<4;i++){
            int ii = row + dir1[i];
            int jj = col + dir2[i];

            if(ii >= 0 && ii < grid.length && jj >=0 && jj < grid[0].length && visit[ii][jj] != 1 && grid[ii][jj] == 1){
                DFS(ii,jj,grid,visit);
            }
        }
    }
    public int numEnclaves(int[][] grid) {
        if(grid.length <= 1)return 0;

        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;

        int[][] visit = new int[n][m];

        // for first and last row:
        for(int j = 0;j<m;j++){
            if(grid[0][j] == 1 && visit[0][j] != 1){
                DFS(0,j,grid,visit);
            }
            if(grid[n-1][j] == 1 && visit[n-1][j] != 1){
                DFS(n-1,j,grid,visit);
            }
        }

        // for first and last col
        for(int i = 0;i<n;i++){
            if(grid[i][0] == 1 && visit[i][0] != 1){
                DFS(i,0,grid,visit);
            }
            if(grid[i][m-1] == 1 && visit[i][m-1] != 1){
                DFS(i,m-1,grid,visit);
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1 && visit[i][j] != 1){
                    cnt++;
                }
            }
        }

        return cnt;

    }
}