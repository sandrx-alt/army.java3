package Soldier;

public class Attacker extends Soldier {

    public Attacker(String name, int health) {
        super(name, health);
    }
    @Override
    public void action() {
        System.out.println(getName() + "is preparing to attack! ");
    }
    public void attack(Soldier defender) {
        int damage = 10;
        defender.takeDamage(damage);
        System.out.println(this.getName() + " attacks " + defender.getName() + " and deals " + damage + " damage.");
    }
}

