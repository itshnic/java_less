package Game_HW.Person;

import java.util.ArrayList;

/**
 * Монах
 * Sword - меч
 */
public class Monk extends Person {
    public Monk( int age, String name,int positionX,int positionY) {
        super(30, 90, 100,
                80, 30, 80,
                "Sword", age, name,positionX,positionY);
    }

    @Override
    public void step(ArrayList<Person> team) {

    }
}
