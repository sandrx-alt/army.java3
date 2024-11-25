package Soldier;
import Soldier.Defender;
import Soldier.Soldier;
import Soldier.Attacker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Soldier> soldiers = new ArrayList<>();

        soldiers.add(new Attacker(" Jozef ", 80));
        soldiers.add(new Attacker(" Peter ", 80));
        soldiers.add(new Attacker(" John ", 100));
        soldiers.add(new Defender(" Alice ", 90));
        soldiers.add(new Defender(" Laura ", 70));
        soldiers.add(new Defender(" Martin ", 90));


        for (Soldier soldier : soldiers) {
            soldier.action();
        }
        for (Soldier soldier : soldiers) {
            if (soldier instanceof Attacker) {
                Attacker attacker = (Attacker) soldier;
                for(Soldier target : soldiers) {
                    if(target instanceof Defender) {
                        Defender defender = (Defender) target;
                        attacker.attack(defender);
                        System.out.println(defender);
                    }
                }
            }
        }
    }
}



