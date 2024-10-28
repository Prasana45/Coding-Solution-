import java.util.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        while (true) {
            String[] availableMoves = {"Rock", "Paper", "Scissors"};
            String computerMove = availableMoves[new Random().nextInt(availableMoves.length)];
            System.out.println("Computer has chosen its move.\nNow it's your turn to choose. Good Luck!\n");
            
            String userMove;
            while (true) {
                System.out.println("Choose your move: 'Rock' 'Paper' 'Scissors'");
                userMove = scn.nextLine().trim().toLowerCase();
                if (userMove.equals("rock") || userMove.equals("paper") || userMove.equals("scissors")) break;
                System.out.println("\nInvalid Move! Try again.\n");
            }
            
            System.out.println("Computer chose: " + computerMove);
            
            if (userMove.equalsIgnoreCase(computerMove)) {
                System.out.println("It's a tie!");
            } else if (userMove.equals("rock") && computerMove.equalsIgnoreCase("Scissors") || 
                       userMove.equals("paper") && computerMove.equalsIgnoreCase("Rock") || 
                       userMove.equals("scissors") && computerMove.equalsIgnoreCase("Paper")) {
                System.out.println("You won! Congratulations!");
            } else {
                System.out.println("Computer won! Better luck next time!");
            }
            
            System.out.println("\nDo you want to play again? Type 'yes' or 'no'");
            String playAgain;
            while (true) {
                playAgain = scn.nextLine().trim().toLowerCase();
                if (playAgain.equals("yes") || playAgain.equals("no")) break;
                System.out.println("\nInvalid Input. Try again.\n");
            }
            
            if (playAgain.equals("no")) break;
            System.out.println("\n*****************************************************************************\n");
        }
		scn.close();
    }
}
