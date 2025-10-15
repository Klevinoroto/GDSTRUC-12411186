import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int currentRound = 0;

        String[] cards = {
                "Ace of Diamonds", "2 of Diamonds", "3 of Diamonds", "4 of Diamonds", "5 of Diamonds", "6 of Diamonds", "7 of Diamonds", "8 of Diamonds", "9 of Diamonds", "10 of Diamonds", "Jack of Diamonds", "Queen of Diamonds", "King of Diamonds",
                "Ace of Hearts", "2 of Hearts", "3 of Hearts", "4 of Hearts", "5 of Hearts", "6 of Hearts", "7 of Hearts", "8 of Hearts", "9 of Hearts", "10 of Hearts", "Jack of Hearts", "Queen of Hearts", "King of Hearts",
                "Ace of Clubs", "2 of Clubs", "3 of Clubs", "4 of Clubs", "5 of Clubs", "6 of Clubs", "7 of Clubs", "8 of Clubs", "9 of Clubs", "10 of Clubs", "Jack of Clubs", "Queen of Clubs", "King of Clubs",
                "Ace of Spades", "2 of Spades", "3 of Spades", "4 of Spades", "5 of Spades", "6 of Spades", "7 of Spades", "8 of Spades", "9 of Spades", "10 of Spades", "Jack of Spades", "Queen of Spades", "King of Spades",
        };

        ArrayList<String> playerDeck = new ArrayList<>();
        ArrayList<String> playerHand = new ArrayList<>();
        ArrayList<String> discardedPile = new ArrayList<>();
        for (int i = 0; i < 30; i++) { // Set up 30 random cards
            String randomCard = cards[(int)(Math.random() * cards.length)];
            playerDeck.add(randomCard);
        }

        while (!playerDeck.isEmpty()) {
            currentRound++;

            System.out.println("--------------------------------------");
            System.out.println("               Round " + currentRound + "\n");
            switch ((int)(Math.random()*3)) {
                case 0: // Draw
                    relocateTopCardStack(playerDeck, playerHand, "Draw", "No more cards to draw!");
                    break;
                case 1: // Discard
                    relocateTopCardStack(playerHand, discardedPile, "Discard", "No more cards to discard!");
                    break;
                case 2: // Retrieve
                    relocateTopCardStack(discardedPile, playerHand, "Retrieve", "Nothing in the discard pile left to get!");
                    break;
            }
            displayRoundResults(playerDeck, playerHand, discardedPile);
        }
    }

    private static void relocateTopCardStack(ArrayList<String> retrievedStack, ArrayList<String> relocatedStack, String action, String emptyStackMessage)
    {
        int randomAmount = (int)(Math.random()*5)+1;

        System.out.println("} The player shall " + action + " " + randomAmount + " card/s!");

        for (int i = 0; i < randomAmount; i++) {
            if (!retrievedStack.isEmpty()) {
                String topCard = retrievedStack.removeLast();
                relocatedStack.add(topCard);
                System.out.println(" - " + topCard);
            }
            else {
                System.out.println("} " + emptyStackMessage);
                break;
            }
        }
        System.out.println("\n");
    }

    private static void displayRoundResults(ArrayList<String> playerDeck, ArrayList<String> playerHand, ArrayList<String> discardedPile)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("            -- Results --\n");
        System.out.println(" Cards currently being held:\n");
        System.out.println(" V [Bottom Hand] V\n");
        for (String card : playerHand) {
            System.out.println(" - " + card);
        }
        System.out.println("\n  - [Top Hand] - ");
        System.out.println("\nRemaining cards in the deck: " + playerDeck.size());
        System.out.println("Cards in the discarded pile: " + discardedPile.size());
        System.out.println("\n > Press Enter to continue...");
        scanner.nextLine();
    }
}
