class Solution {
    
    public boolean exist(char[][] board, String word) {
        char[] ch=word.toCharArray();
        int rows=board.length;
        int col=board[0].length;
        boolean[][] result=new boolean[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                if(backtrack(board,ch,i,j,0,result)){
                    return true;
                }
            }
        }
        return false;
    }
    boolean backtrack(char[][] board,char[] ch,int i,int j,int start,boolean[][] result){
        if(start==ch.length){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length ||result[i][j] ||
            board[i][j] != ch[start] ){
                return false;
            }
        result[i][j]=true;
        boolean found=backtrack(board,ch,i+1,j,start+1,result) ||backtrack(board,ch,i-1,j,start+1,result) ||backtrack(board,ch,i,j+1,start+1,result) ||backtrack(board,ch,i,j-1,start+1,result);
        result[i][j]=false;
        return found;
    }
}