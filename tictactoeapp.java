public class tictactoeapp {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("❌ Invalid Move: Out of bounds!");
            return false;
        }

        if (board[row][col] != ' ') {
            System.out.println("❌ Invalid Move: Cell already occupied!");
            return false;
        }

        return true;
    }

    // 🔥 MAIN METHOD (ENTRY POINT)
    public static void main(String[] args) {

        char[][] board = {
            {'X', 'O', ' '},
            {' ', 'X', ' '},
            {'O', ' ', ' '}
        };

        int row = 1;
        int col = 2;

        if (isValidMove(board, row, col)) {
            board[row][col] = 'X';
            System.out.println("✅ Move placed successfully!");
        }
    }
}