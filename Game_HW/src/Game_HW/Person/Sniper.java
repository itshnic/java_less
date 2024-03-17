package Game_HW.Person;

import java.util.ArrayList;

/**
 * Снайпер
 * rifle - винтовка
 */
public class Sniper extends Person {
    public Sniper( int age, String name,int positionX,int positionY) {
        super(22, 80, 50,
                80, 50, 40,
                "rifle", age, name,positionX,positionY);
    }

    @Override
    public void step(ArrayList<Person> team) {

    }
}