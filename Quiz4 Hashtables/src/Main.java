public class Main {
    public static void main(String[] args) {
        Player pikachu = new Player(25, "Pikachu", 25);
        Player celebi = new Player(251, "Celebi", 251);
        Player hitmonchan = new Player(107, "Hitmonchan", 107);
        Player mankey = new Player(56, "Mankey", 56);
        Player starmie = new Player(121, "Starmie", 121);
        Player togepi = new Player(56, "Togepi", 56);
        Player emolga = new Player(56, "Emolga", 56);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(pikachu.getUserName(), pikachu);
        hashtable.put(celebi.getUserName(), celebi);
        hashtable.put(hitmonchan.getUserName(), hitmonchan);
        hashtable.put(mankey.getUserName(), mankey);
        hashtable.put(starmie.getUserName(), starmie);
        hashtable.put(togepi.getUserName(), togepi);

        hashtable.printHashtable();

        hashtable.remove("Pikachu");
        hashtable.remove("Pikachu2");

        hashtable.printHashtable();

        System.out.println("\nElement at key " + celebi.getUserName() + " = " + hashtable.get(celebi.getUserName()));
    }
}