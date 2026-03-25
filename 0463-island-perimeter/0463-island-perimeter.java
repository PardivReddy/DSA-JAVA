class Solution {
    public int islandPerimeter(int[][] grid) {
        int n=grid.length;
        int c=grid[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    sum=sum+4;
                if(j+1<c && grid[i][j+1]==1){
                    sum -=2;
                }
                if(i+1 < n && grid[i+1][j]==1){
                    sum-=2;
                }
            }
            }

        }
        return sum;
    }
}