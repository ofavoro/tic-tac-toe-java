enum Move {
    X,
    O,
    I
}

public class TicTacToe {
    Move[][] board = { { Move.I, Move.I, Move.I }, { Move.I, Move.I, Move.I }, { Move.I, Move.I, Move.I } };

    public void gameLoop() {

    }

    private boolean checkWin() {
        for (int y = 0; y < 3; y++) {
            if (board[y][0] == board[y][1] && board[y][1] == board[y][2] && board[y][0] != Move.I) {
                return true;
            }
        }

        for (int x = 0; x < 3; x++) {
            if (board[0][x] == board[1][x] && board[1][x] == board[2][x] && board[0][x] != Move.I) {
                return true;
            }
        }

        if (board[0][0] != Move.I && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }

        if (board[2][0] != Move.I && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            return true;
        }

        return false;
    }

    private void makeMove() {

    }

    private int getInput() {
        return 0;
    }
}
