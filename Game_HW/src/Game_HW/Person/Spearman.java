package Game_HW.Person;

import Game_HW.Game_start.Coordinate;
import Game_HW.Game_start.Search;

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
    public void step(ArrayList<Person> opponentTeam, ArrayList<Person> myTeam) {
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
                System.out.println("Сделал ход: " + this.toString());
            }
        } else System.out.println(this.toString() + " --> Game over");
    }
}