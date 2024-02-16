public class Game {
    public static void main(String[] args) {   
        Player player1 = new Player("John", 100);
        player1.prefix = "Mr.";
        System.out.println("Prefix: " + player1.prefix);
        // Accessing player information using getter methods
        System.out.println("Player Name: " + player1.getName());
        System.out.println("Player Health: " + player1.getHealth());

        // Modifying player information using setter methods
        player1.setName("Jame");
        player1.setHealth(80);
        player1.displayInfo();

        // Displaying updated player information
        player1.deleteHealth(50);
        player1.displayInfo();

        player1.deleteHealth(40);
        player1.displayInfo();
    }
}