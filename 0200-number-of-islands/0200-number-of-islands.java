class Solution {
    // space : O(N);
    // time : O(N^2) aprox
    public static int[] dir1 = {-1,1,0,0};
    public static int[] dir2 = {0,0,1,-1};

    public void dfs(int i,int j,char[][] grid){
        if((i<0 || i >= grid.length || j<0 || j >= grid[0].length) || grid[i][j] != '1')return;

        grid[i][j] = '2';

        for(int d = 0;d<4;d++){
            int ii = i + dir1[d];
            int jj = j + dir2[d];
            dfs(ii,jj,grid);
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    dfs(i,j,grid);
                    count++;
                }
            }
        }

        return count;
    }
}