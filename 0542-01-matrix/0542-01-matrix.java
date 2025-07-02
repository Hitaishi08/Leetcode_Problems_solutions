class Solution {
    static private int[] dir1 = {-1,1,0,0};
    static private int[] dir2 = {0,0,1,-1};

    class Pair<U,V>{
        U first;
        V second;

        Pair(U first,V second){
            this.first = first;
            this.second = second;
        }

    }

    public void BFS(int mat[][],int[][]visit,Queue<Pair<Pair<Integer,Integer>,Integer>> q,int[][] ans){

        while(!q.isEmpty()){
            Pair<Pair<Integer, Integer>, Integer> data = q.poll();

            int row = data.first.first;
            int col = data.first.second;
            int dist = data.second;

            for(int i = 0;i<4;i++){
                int ii = row + dir1[i];
                int jj = col + dir2[i];

                if(ii >= 0 && ii < mat.length && jj >= 0 && jj < mat[0].length){
                    if(mat[ii][jj] == 1 && visit[ii][jj] != 1){
                        ans[ii][jj] = dist + 1;
                        visit[ii][jj] = 1;
                        q.offer(new Pair<>(new Pair<>(ii,jj),dist+1));
                    }
                }
            }
        }
    }

    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] ans = new int[n][m];
        int[][] visit = new int[n][m];

        Queue<Pair<Pair<Integer,Integer>,Integer>> q = new LinkedList<>();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(mat[i][j] == 0){
                    visit[i][j] = 1;
                    ans[i][j] = 0;
                    q.offer(new Pair<>(new Pair<>(i,j),0));
                }
            }
        }

        BFS(mat,visit,q,ans);

        return ans;
        
    }
}