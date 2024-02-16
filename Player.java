public class Player {
    public String prefix;
    private String name;
    private int health;
    // Constructor
    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }
    // Getter and setter methods for name
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    // Getter and setter methods for health
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }
    public void displayInfo() {
        System.out.println("Prefix: " + prefix);
        System.out.println("Player Name: " + name);
        System.out.println("Player Health: " + health);
    }
    // Method to display player information
    public void deleteHealth(int damage) {
        if (damage >= health) {
            health = 0;
        } else {
            health -= damage;
        }
    }
}
