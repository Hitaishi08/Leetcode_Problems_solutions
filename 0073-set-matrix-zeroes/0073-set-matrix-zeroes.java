class Solution {
    public void setZeroes(int[][] matrix) {
        int[] row = new int[matrix.length];
        int[] col = new int[matrix[0].length];

        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
  //        0 1 2
 //      0 [1,1,1]
 //      1 [1,0,1]
 //      2 [1,1,1]

 //       [0,1,0] = row
 //       [0,1,0] = col

        for(int i = 1;i<matrix.length;i++){
           if(row[i] == 1){
            for(int j = 0;j<matrix[0].length;j++){
                matrix[i][j] = 0;
            }
           }
        }

        for(int i = 1;i<col.length;i++){
            if(col[i] == 1){
                for(int j = 0;j<row.length;j++){
                    matrix[j][i] = 0;
                }
            }
        }

        if(row[0] == 1){
            for(int i =0;i<col.length;i++){
                matrix[0][i] = 0;
            }
        }

        if(col[0] == 1){
            for(int j = 0;j<row.length;j++){
                matrix[j][0] = 0;
            }
        }

        
    }
}