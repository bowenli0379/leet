package Array;

import java.util.Arrays;

public class GameOfLife_289 {
    public static int[][] gameOfLife(int[][] board){
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j ++){
                int count = getCount(board, i, j);
                if (board[i][j] == 0 && count == 3)
                    board[i][j] = 3;
                if (board[i][j] == 1 && (count < 2 || count > 3))
                    board[i][j] = 2;
            }
        }

        for(int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = board[i][j] % 2;
            }
        }
        return board;
    }
    public static int getCount(int[][] board, int i, int j){
        int count = 0;
        for (int x = i-1; x <= i+1; x++){
            for (int y = j-1; y <= j+1; y++){
                if(x<0||x>=board.length||y<0||y>=board[0].length||(i == x && j == y)){
                    continue;
                }
                if(board[x][y] == 1 || board[x][y] == 2){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[][] board = {{0,1,0},
                {0,0,1},{1,1,1},{0,0,0}};
        for (int i = 0; i < board.length;i++)
            System.out.println(Arrays.toString(gameOfLife(board)[i]));
    }
}
