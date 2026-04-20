import java.util.Random;

public class tictactoeapp {

    public static void main(String[] args) {

        // Step 1: Create Random object
        Random random = new Random();

        // Step 2: Generate random number (0 or 1)
        int toss = random.nextInt(2);

        // Step 3: Declare variables
        char player1Symbol, player2Symbol;
        String currentPlayer;

        // Step 4: Conditional logic based on toss
        if (toss == 0) {
            currentPlayer = "Player 1";
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = "Player 2";
            player1Symbol = 'O';
            player2Symbol = 'X';
        }

        // Step 5: Display results
        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " starts first!");
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
    }
}