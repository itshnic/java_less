package Game_HW.Person;

import java.util.ArrayList;

/**
 * Колдун
 * magic - магия
 */
public class Sorcerer extends Person {
    public Sorcerer( int age,
                     String name,
                     int positionX,
                     int positionY) {
        super(32, 90, 90,
                90, 70, 100,
                "magic", age, name,1,
                positionX,positionY);
    }

    @Override
    public Person step(ArrayList<Person> team) {
        return null;
    }
}