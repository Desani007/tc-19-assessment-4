package rocks.zipcode.io.assessment4.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;


    public TicTacToe(String[][] board) {
        this.board=board;
    }


    public TicTacToe() {

    }

    public String[] getRow(Integer value) {
        String result = "";
        String please = "";
        int countX = 0;
        int countO = 0;
        int j;
        int i;
        for ( i = 0; i < board.length; i++) {

            for ( j = 0; j < board[i].length; j++) {
                if (board[i][j].equals("X")) {
                    countX++;
                } else
                    countO++;


                if (countO == value || countX == value) {
                    result += board[i][j] + ",";
                }
            }
                countX = 0;
                countO = 0;





        }return result.split(",");
    }


    public String[] getColumn(Integer value) {
        return null;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return null;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
