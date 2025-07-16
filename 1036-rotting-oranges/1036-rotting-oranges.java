class Solution {
    class Pair<U,V>{
        U first;
        V second;

        Pair(U first , V second){
            this.first = first;
            this.second = second;
        }
    }

    public static int[] dir1 = {-1,1,0,0};
    public static int[] dir2 = {0,0,1,-1};

    public int bfs(int[][] grid,int[][] visit,Queue<Pair<Integer,Integer>> q){
        int cnt = -1;
        int n = grid.length;
        int  m = grid[0].length;

        while(!q.isEmpty()){
            int size  = q.size();

            for(int i = 0;i<size;i++){
                Pair<Integer,Integer> node = q.poll();
                int row = node.first;
                int col = node.second;

                for(int j = 0;j<4;j++){
                    int ii = row + dir1[j];
                    int jj = col + dir2[j];

                    if(ii >= 0 && ii < n && jj >=0 && jj < m && visit[ii][jj] != 1 && grid[ii][jj] == 1){
                        visit[ii][jj] = 1;
                        q.offer(new Pair<>(ii,jj));
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

        int cnt = 0 , fresh = 0;

        int[][] visit = new int[n][m];
        Queue<Pair<Integer,Integer>> q = new LinkedList<>();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 2){
                    q.offer(new Pair<>(i,j));
                }else if(grid[i][j] == 1)fresh++;
            }
        }

        if(fresh == 0)return 0;

        cnt = bfs(grid,visit,q);

        for(int i = 0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j] == 1 && visit[i][j] == 1)fresh--;
            }
        }

        return (fresh == 0) ? cnt : -1;
    }
}