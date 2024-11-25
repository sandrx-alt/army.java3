package Soldier;

public class Soldier {
    private final String name;
    private int health;

    public Soldier(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) this.health = 0;
    }

    public void action() {
        System.out.println(name + " is acting ");
    }

    @Override
    public String toString() {
        return name + " (Health: " + health + ")";
    }
}

