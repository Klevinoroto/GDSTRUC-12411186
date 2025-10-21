import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int round = 0;
        int playerCount = 0;
        int gamesInitiated = 0;
        ArrayQueue playerQueue = new ArrayQueue(20);

        while (gamesInitiated < 10)
        {
            round++;

            int randomizedPlayersAdded = (int)(Math.random() * 6) + 1;
            for (int i = 0; i < randomizedPlayersAdded; i++)
            {
                int randomLevel = (int)(Math.random() * 5);

                playerCount++;
                playerQueue.enqueue(new Player(playerCount, "Player" + playerCount, randomLevel));
            }

            System.out.println(randomizedPlayersAdded + " players added to the queue!");
            playerQueue.printQueue();

            if (playerQueue.size() >= 5)
            {
                for (int i = 0; i < 5; i++)
                {
                    Player removedPlayer = playerQueue.dequeue();
                }
                gamesInitiated++;
                System.out.println("\nGame No. " + gamesInitiated + " initiated! - Dequeued 5 players from the front.");
            }

            System.out.println("\n > Round "+ round + " complete. [Press enter to continue]");

            scanner.nextLine();
        }

        System.out.println("10 games have been successfully initiated!");

    }
}