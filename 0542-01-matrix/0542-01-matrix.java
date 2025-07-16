class Solution {
    class Pair<V,U>{
        V first;
        U second;

        Pair(V first,U second){
            this.first = first;
            this.second = second;
        }
    }

    public static int[] dir1 = {-1,1,0,0};
    public static int[] dir2 = {0,0,1,-1};

    public void bfs(int[][]visit,int[][] mat,Queue<Pair<Integer,Pair<Integer,Integer>>> q,int[][] ans){

        while(!q.isEmpty()){
            Pair<Integer,Pair<Integer,Integer>> data = q.poll();
            Pair<Integer,Integer> curr  = data.second;

            int dist = data.first;
            int row = curr.first;
            int col = curr.second;

            for(int i = 0;i<4;i++){
                int ii = row + dir1[i];
                int jj = col + dir2[i];

                if(ii >= 0 && ii < mat.length && jj >= 0 && jj < mat[0].length && mat[ii][jj] == 1 && visit[ii][jj] != 1){
                    ans[ii][jj] = dist + 1;
                    visit[ii][jj] = 1;
                    q.offer(new Pair<>(dist + 1,new Pair<>(ii,jj)));
                }
            }
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int[][] visit = new int[n][m];
        int[][] ans = new int[n][m];

        Queue<Pair<Integer,Pair<Integer,Integer>>> q = new LinkedList<>();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(mat[i][j] == 0){
                    q.offer(new Pair<>(0,new Pair<>(i,j)));
                    ans[i][j] = 0;
                }
            }
        }

        bfs(visit,mat,q,ans);

        return ans;
    }
}