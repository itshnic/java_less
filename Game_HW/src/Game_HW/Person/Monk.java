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
    public Person step(ArrayList<Person> opponentTeam, ArrayList<Person> myTeam) {
        if (health > 0) {
            Search search = new Search();
            int x = this.positionX;
            int y = this.positionY;
            Person opponent = search.searchOpponent(opponentTeam,x,y);
            Coordinate myCoord = new Coordinate(x,y);
            double distanceOpponent = myCoord.distance(opponent);

            if (distanceOpponent >= 1 && distanceOpponent < 1.5)
                this.attack(opponent);
            else {
                myCoord.stepUp(opponent, search.searchOpponent(myTeam, x, y),this);
                System.out.println("Сделал ход: " + this);
            }
        } else System.out.println("Game over health = " + health);

        return null;
    }

}
