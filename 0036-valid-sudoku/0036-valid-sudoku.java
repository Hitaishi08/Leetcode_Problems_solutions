class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] gridset = new HashSet[9];
        HashSet<Character>[] colset = new HashSet[9];

        for(int i=0;i<9;i++){
            gridset[i] = new HashSet<>();
            colset[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++){
            HashSet<Character> rowset = new HashSet<>();

            for(int j = 0;j<9;j++){
                
                char val = board[i][j];
                int gridindex = (i/3) * 3 + (j/3);

                if(val != '.'){
                    if(rowset.contains(val))return false;
                    if(colset[j].contains(val))return false;
                    if(gridset[gridindex].contains(val))return false;

                    rowset.add(val);
                    colset[j].add(val);
                    gridset[gridindex].add(val);
                }
            }
        }
        return true;
    }
}