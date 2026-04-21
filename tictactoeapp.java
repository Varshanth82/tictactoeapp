public class tictactoeapp {

    // UC5: Validate Move
    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("❌ Out of bounds!");
            return false;
        }
        if (board[row][col] != ' ') {
            System.out.println("❌ Cell already occupied!");
            return false;
        }
        return true;
    }

    // ✅ UC6: Update Board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // 🔥 Main method
    public static void main(String[] args) {

        char[][] board = {
            {'X', 'O', ' '},
            {' ', 'X', ' '},
            {'O', ' ', ' '}
        };

        int row = 1;
        int col = 2;
        char symbol = 'X';

        // Flow: Validate → Update
        if (isValidMove(board, row, col)) {
            updateBoard(board, row, col, symbol);
            System.out.println("✅ Move updated on board!");
        }
    }
}