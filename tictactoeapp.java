import java.util.Random;

public class  tictactoeapp {

    // UC5: Validate Move
    public static boolean isValidMove(char[][] board, int row, int col) {
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        if (board[row][col] != ' ') return false;
        return true;
    }

    // UC6: Update Board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // ✅ UC7: Computer Move
    public static void computerMove(char[][] board) {
        Random rand = new Random();

        int row, col;

        while (true) {

            // 1. Generate random slot (1–9)
            int slot = rand.nextInt(9) + 1;

            // 2. Convert to row & col
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // 3. Check validity
            if (isValidMove(board, row, col)) {
                // 4. Place move
                updateBoard(board, row, col, 'O');
                System.out.println("🤖 Computer placed at: " + slot);
                break; // exit loop after valid move
            }
        }
    }

    // 🔥 Main Method
    public static void main(String[] args) {

        char[][] board = {
            {'X', 'O', ' '},
            {' ', 'X', ' '},
            {'O', ' ', ' '}
        };

        computerMove(board);
    }
}