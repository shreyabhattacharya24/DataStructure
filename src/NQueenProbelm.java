public class NQueenProbelm {
    public static boolean nQueen(int[][] board, int row){
        int N=board.length;
        if(row==N)
            return true;
        for(int col=0;col<N;col++){
            if(isSafe(board,row,col)) {
                board[row] [col]=1;
                if(nQueen(board,row+1))
                    return true;
                board[row][col]=0;
            }

        }
        return false;
    }
    public static boolean isSafe(int[][]board, int row, int col){
        //check left side
        for(int i=0;i<col;i++)
            if(board[row][i]==1)
                return false;
        //check upper left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i--,j--)
            if(board[i][j]==1)
                return false;
        //check down left diagonal
        for(int i=row,j=col;i<board.length && j>=0;i++,j--)
            if(board[i][j]==1)
                return false;
        return true;

    }
}
