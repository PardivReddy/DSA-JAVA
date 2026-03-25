class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int center=image[sr][sc];
        if(center==color){
            return image;
        }
        dfs(image,sr,sc,center,color);
        return image;
    }
    private void dfs(int[][] image,int i,int j,int center,int color){
        int m=image.length;
        int n=image[0].length;
        if(i<0 || j<0 || i>=m || j>=n || image[i][j]!=center){
            return ;
        }
        image[i][j]=color;
        dfs(image,i+1,j,center,color);
        dfs(image,i-1,j,center,color);
        dfs(image,i,j+1,center,color);
        dfs(image,i,j-1,center,color);
        
    }
}