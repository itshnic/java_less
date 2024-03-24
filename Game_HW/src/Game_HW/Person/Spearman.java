package Game_HW.Person;

import java.util.ArrayList;

/**
 * Копейщик
 * Spear - копье
 */
public class Spearman extends Person {
    public Spearman(int age,
                    String name,
                    int positionX,
                    int positionY) {
        super(12, 60, 50,
                50, 45, 25,
                "Spear", age, name, 2,
                positionX, positionY);
    }

    @Override
    public Person step(ArrayList<Person> opponentTeam,ArrayList<Person> myTeam) {
        return null;
    }
}