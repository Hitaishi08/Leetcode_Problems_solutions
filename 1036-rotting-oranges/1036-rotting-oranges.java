class Solution {
    static private int[] dir1 = {-1,1,0,0};
    static private int[] dir2 = {0,0,1,-1};

    class Pair{
        int first;
        int second;

        Pair(int first,int second){
            this.first = first;
            this.second = second;
        }
    }

    private int bfs(int[][] grid,int[][]visit,int row,int col){
        Queue<Pair> q = new LinkedList<>();

        int cnt = -1;
        visit[row][col] = 1;

        q.offer(new Pair(row,col));

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0;i<size;i++){
                int first = q.peek().first;
                int second = q.peek().second;
                q.poll();
                for(int j = 0;j<4;j++){
                    int ii = first + dir1[j];
                    int jj = second + dir2[j];

                if(ii>=0 && ii < grid.length && jj >=0 && jj < grid[0].length && visit[ii][jj] != 1 && grid[ii][jj] == 1){
                    visit[ii][jj] = 1;
                    grid[ii][jj] = 2;
                    q.offer(new Pair(ii,jj));
                }
            }
            }
            cnt++;

        }

        return cnt;
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visit = new int[n][m];
        int cnt = -1;

        int fresh = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                fresh++;
                }
            }
        }

        if(fresh < 1)return 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 2 && visit[i][j] != 1){
                    cnt = bfs(grid,visit,i,j);
                    break;
                }
            }
        }

        int left = 0;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1)left++;
            }
        }

        return (left > 0) ? -1 : cnt;
    }
}