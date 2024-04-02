package Game_HW.Presenter.Person;

import Game_HW.Model.Person;
import Game_HW.Presenter.Coordinate;
import Game_HW.Presenter.Search;
import Game_HW.View.View;

import java.util.ArrayList;

/**
 * Копейщик
 * Spear - копье
 */
public class Spearman extends Person {
    int spears;
    public Spearman(int age,
                    String name,
                    int positionX,
                    int positionY) {
        super(25, 60, 50,
                50, 45, 25,
                "Spear", age, name, 2,
                positionX, positionY);
        this.spears = 30;
    }

    @Override
    public void step(ArrayList<Person> opponentTeam, ArrayList<Person> myTeam) {
        if (health > 0) {
            int x = this.positionX;
            int y = this.positionY;
            Person opponent = new Search().searchOpponent(opponentTeam,x,y);
            Coordinate myCoord = new Coordinate(x,y);
            double distanceOpponent = myCoord.distance(opponent);

            if (distanceOpponent >= 1 && distanceOpponent < 1.5) {
                new View().getInfo(this, opponent, " Атака", this.attack(opponent));
                this.spears--;
            }
            else {
                myCoord.stepUp(opponent, new Search().searchOpponent(myTeam, x, y),this);
                new View().getInfo(this,null," Ходит", 0);
            }
        } else new View().getInfo(this,null," Убит", 0);

    }
}