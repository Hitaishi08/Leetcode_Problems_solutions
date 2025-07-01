class Solution {
    private static int[] dir1 = {-1,1,0,0};
    private static int[] dir2 = {0,0,1,-1};
    public void dfs(int[][] image,int incol,int sr,int sc,int color){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc] == color || image[sr][sc] != incol)return;

        image[sr][sc] = color;

        for(int i = 0;i<4;i++){
            int ii = sr + dir1[i];
            int jj = sc + dir2[i];

            dfs(image,incol,ii,jj,color);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image,image[sr][sc],sr,sc,color);

        return image;
    }
}