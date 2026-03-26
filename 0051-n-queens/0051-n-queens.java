class Solution {
    public List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        backtrack(board,0);
        return res;
    }
    public void backtrack(char board[][],int row){
        if(row==board.length){
            ArrayList<String> l = new ArrayList<>();
            for(int i=0;i<board.length;i++){
                l.add(new String(board[i]));
            }
            res.add(l);
            return;
        }
        for(int col = 0;col<board[row].length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                backtrack(board,row+1);
                board[row][col] ='.';
            }
        }
    }
    public boolean isSafe(char board[][],int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q'){
                return false;
            }
            for(int j=0;j<board[row].length;j++){
                if(board[i][j]=='Q'){
                    if(Math.abs(row-i)==Math.abs(col-j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}