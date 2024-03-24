package Game_HW.Person;

import java.util.ArrayList;

/**
 * Грабитель
 * musket - мушкет
 */
public class Robber extends Person {
    public Robber( int age,
                   String name,
                   int positionX,
                   int positionY) {
        super(17, 50, 50,
                50, 10, 15,
                "musket", age, name,2,
                positionX,positionY);
    }

    @Override
    public Person step(ArrayList<Person> opponentTeam,ArrayList<Person> myTeam) {
        return null;
    }
}