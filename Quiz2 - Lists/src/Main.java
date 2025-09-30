import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();
        playerLinkedList.addToFront(new Player(1, "Saitama", 999));
        playerLinkedList.addToFront(new Player(2, "Goku", 500));
        playerLinkedList.addToFront(new Player(3, "Deku", 100));
        playerLinkedList.addToFront(new Player(4, "Miwa", 1));

        playerLinkedList.printLinkedList();
        System.out.print("\n Current size: " + playerLinkedList.size());

        System.out.print("\n\nREMOVING HEAD\n\n");
        playerLinkedList.removeHead();

        playerLinkedList.printLinkedList();
        System.out.print("\n Current size: " + playerLinkedList.size());

        boolean checkContains = playerLinkedList.contains(new Player(1, "Saitama", 999));
        boolean checkContainsSukuna = playerLinkedList.contains(new Player(5, "Sukuna", 300));
        int checkIndex = playerLinkedList.indexOf(new Player(2, "Goku", 500));
        System.out.print("\n\n Contains Saitama?: " + checkContains);
        System.out.print("\n Contains Sukuna?: " + checkContainsSukuna);
        System.out.print("\n Index of Goku is: " + checkIndex);

//        List<Player> playerList = new ArrayList<Player>();
//        playerList.add(new Player(1, "Saitama", 999));
//        playerList.add(new Player(2, "Goku", 999));
//        playerList.add(new Player(3, "Deku", 999));
//
//        for (Player player : playerList) {
//            System.out.println(player);
//        }
//
//        int index = playerList.indexOf(new Player(1, "Saitama", 999));
//        System.out.println("\nIndex of Saitama? " + index);
    }
}
