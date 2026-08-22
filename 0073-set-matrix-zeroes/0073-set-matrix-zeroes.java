class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] iszerorow=new boolean[m];
        boolean[] iszerocol=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    iszerorow[i]=true;
                    iszerocol[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(iszerorow[i]){
                for(int j=0;j<n;j++){
                matrix[i][j]=0;
            }
        }
    }
        for(int j=0;j<n;j++){
            if(iszerocol[j]){
                for(int i=0;i<m;i++){
                matrix[i][j]=0;
            }
        }
        }
    }
}