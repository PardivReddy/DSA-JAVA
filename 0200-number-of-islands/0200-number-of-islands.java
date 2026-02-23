class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    backtrack(grid,i,j);
                    count++;
                }
               
            }
             
        }
        return count;
    }
    void backtrack(char[][]grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]=='0'){
            return;
        }
            grid[i][j]='0';
            backtrack(grid,i+1,j);
            backtrack(grid,i-1,j);
            backtrack(grid,i,j+1);
            backtrack(grid,i,j-1);
    }
}