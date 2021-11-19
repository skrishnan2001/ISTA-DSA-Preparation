package Week03_Arrays;

//TC: O(1) | SC: O(1) -> Tic Tac Toe board is always a 3 x 3 matrix

public class Q11_TicTacToeIsValid {
    boolean isWinning(char[] board, char ch) {
        // Row-wise check for winning pos
        for (int i = 0; i <= 6; i += 3) {
            if (board[i] == board[i + 1] && board[i + 1] == board[i + 2] && board[i] == ch)
                return true;
        }

        // Col-wise check for winning pos
        for (int i = 0; i < 3; i++) {
            if (board[i] == board[i + 3] && board[i + 3] == board[i + 6] && board[i] == ch)
                return true;
        }

        // Diagonal winning positions check
        if (board[0] == board[4] && board[4] == board[8] && board[0] == ch)
            return true;

        if (board[2] == board[4] && board[4] == board[6] && board[2] == ch)
            return true;

        return false;
    }

    boolean isValid(char[] board) {
        int countX = 0, countO = 0;

        for (int i = 0; i < 9; i++) {
            if (board[i] == 'X')
                countX++;
            else
                countO++;
        }

        if (countX < countO || countX > countO + 1)
            return false;

        if (isWinning(board, 'X') && isWinning(board, 'O'))
            return false;

        if (isWinning(board, 'O') && countX == countO + 1)
            return false;

        return true;
    }
}
