package Game_HW.Person;


import java.util.ArrayList;

/**
 * Крестьянин
 * pitchfork - вилы
 */
public class Peasant extends Person {
    public Peasant( int age, String name,int positionX,int positionY) {
        super(5, 50, 50,
                40, 10, 15,
                "Pitchfork", age, name,positionX,positionY);
    }

    @Override
    public void step(ArrayList<Person> team) {

    }
}