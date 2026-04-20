import java.util.Scanner;

public class tictactoeapp {

    public static int getUserSlot(Scanner sc) {
        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();
        return slot;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userSlot = getUserSlot(sc);

        System.out.println("You selected slot: " + userSlot);

        sc.close(); // close once at end
    }
}