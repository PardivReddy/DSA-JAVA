class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] res=new int[r][c];
        int col=0,row=0;
        if (m*n != r * c) return mat;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[row][col]=mat[i][j];
                col++;
                if(col==c){
                    col=0;
                    row++;
                }
            }
        }
        return res;

    }
}