package Game_HW.Person;

import Game_HW.Game_start.Coordinate;
import Game_HW.Game_start.Search;
import java.util.ArrayList;



/**
 * Монах
 * Sword - меч
 */
public class Monk extends Person {
    public Monk(int age,
                String name,
                int positionX,
                int positionY) {
        super(30, 90, 100,
                80, 30, 80,
                "Sword", age, name, 1,
                positionX, positionY);
    }

    @Override
    public void step(ArrayList<Person> opponentTeam,ArrayList<Person> myTeam) {
        return;
    }

}
