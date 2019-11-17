package Array;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku_36 {
    public static boolean isValidSudoku(char[][] board){
            for (int i = 0; i < board.length; i++){
                HashSet <Character> row = new HashSet<>();
                HashSet <Character> col = new HashSet<>();
                HashSet <Character> cube = new HashSet<>();

                for (int j = 0; j < board[0].length; j++){
                    if (board[i][j] != '.' && !row.add(board[i][j])){
                        return false;
                    }

                    if (board[j][i] != '.' && !col.add(board[j][i])){
                        return false;
                    }

                    int m = 3*(i/3) + (j/3);
                    int n = 3*(i%3) + (j%3);
                    if (board[m][n] != '.' && !cube.add(board[m][n])){
                        return false;
                    }
                }
            }
            return true;
    }
    public static void main(String[] args){
        char[][] board = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6','.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        System.out.println(isValidSudoku(board));
    }
}
