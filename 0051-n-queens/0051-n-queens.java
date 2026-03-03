class Solution {
    List<List<String>> res=new ArrayList<>();
    boolean[] cols;
    boolean[] diag;
    boolean[] diag2;
    char[][] board;
    int n;
    public List<List<String>> solveNQueens(int n) {
       this.n=n;
       cols=new boolean[n];
       diag=new boolean[2*n];
       diag2=new boolean[2*n];
       board=new char[n][n];
       for(int i=0;i<n;i++){
        Arrays.fill(board[i],'.');
       }
       backtrack(0);
       return res;
    }
    void backtrack(int row){
        if(row==n){
            addSolution();
            return ;
        }
        for(int col=0;col<n;col++){
            if (cols[col] || diag[row+col] || diag2[row-col+n])
                continue;
            board[row][col]='Q';
            cols[col]=true;
            diag[row+col]=true;
            diag2[row-col+n]=true;
            backtrack(row+1);
            board[row][col]='.';
            cols[col]=false;
            diag[row+col]=false;
            diag2[row-col+n]=false;

        }
    }
    void addSolution(){
        List<String> list=new ArrayList<>();
        for(char[] row:board){
            list.add(new String(row));

        }
        res.add(list);
    }
}