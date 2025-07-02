class Solution {
    private static int[] dir1 = {-1,1,0,0};
    private static int[] dir2 = {0,0,1,-1};

    private static void DFS(int row,int col,char[][] board,int[][] visit){
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || visit[row][col] == 1 || board[row][col] != 'O')return;

        visit[row][col] = 1;
        board[row][col] = 'N';

        for(int i = 0;i<4;i++){
            int ii = row + dir1[i];
            int jj = col + dir2[i];
        
            DFS(ii,jj,board,visit);
            
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        int[][] visit = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i == 0 || j == 0 || i == n-1 || j == m-1 ) && board[i][j] == 'O'){
                    DFS(i,j,board,visit);
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
                if(board[i][j] == 'N'){
                    board[i][j] = 'O';
                }
            }
        }
    }
}