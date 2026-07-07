class Solution {
    // 1. transpose the matrix
    // 2. Rotate the column
    public void rotate(int[][] matrix) {
        int n = matrix.length , m = matrix[0].length;

        // transpose of the matrix
        // j = i + 1 because all diagnol elements will remain same
        for(int i = 0;i<n;i++){
            for(int j = i + 1;j<m;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }
        }
    }
}