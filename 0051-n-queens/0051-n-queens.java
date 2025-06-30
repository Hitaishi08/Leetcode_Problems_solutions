class Solution {
    public static boolean isSafe(int row,int col,char[][] board){

        //up
        for(int i = row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //Dl
        for(int i = row-1,j=col-1 ;i>=0 && j >= 0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // Dr
        for(int i = row-1,j=col+1 ;i>=0 && j < board[0].length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }
    public static void nQueens(char[][] board,int row,List<List<String>> ans){

        if(row == board.length){
            List<String> li = new ArrayList<>();
            for(int i = 0;i<board.length;i++){
                String str = "";
                for(int j= 0;j<board[0].length;j++){
                    str += board[i][j];
                }
                li.add(str);
            }
            ans.add(li);
            return;
        }

        for(int j = 0;j<board[0].length;j++){
            if(isSafe(row,j,board)){
                board[row][j] = 'Q';
                nQueens(board,row+1,ans);
                board[row][j] = '.'; // backtrack 
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];

        // step 1: insert '.' on board
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                board[i][j] = '.';
            }
        }
        nQueens(board,0,ans);

        return ans;
    }
}