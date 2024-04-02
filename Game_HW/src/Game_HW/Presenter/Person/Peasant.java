package Game_HW.Presenter.Person;


import Game_HW.Model.Person;
import Game_HW.Presenter.Coordinate;
import Game_HW.Presenter.Names;
import Game_HW.Presenter.Search;
import Game_HW.View.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Крестьянин
 * pitchfork - вилы
 */
public class Peasant extends Person {
    public Peasant(int age,
                   String name,
                   int positionX,
                   int positionY) {
        super(5, 50, 50,
                40, 10, 15,
                "Pitchfork", age, name, 0,
                positionX, positionY);
    }

    @Override
    public void step(ArrayList<Person> opponentTeam, ArrayList<Person> myTeam) {
        if (health > 0) {
            int x = this.positionX;
            int y = this.positionY;
            Person opponent = new Search().searchOpponent(opponentTeam, x, y);
            Coordinate myCoord = new Coordinate(x, y);
            double distanceOpponent = myCoord.distance(opponent);
            ArrayList<Person> myTeamPerson = new Search().getPersonMyTeam(myTeam, new ArrayList<>(Arrays.asList("Crossbowman", "Sniper")));

            if (distanceOpponent >= 1 && distanceOpponent < 1.5)
                new View().getInfo(this, opponent, " Атака", this.attack(opponent));
            else if (!myTeamPerson.isEmpty()) {
                new View().getInfo(this,myTeamPerson.get(new Random().nextInt(myTeamPerson.size())) , "Пополнил БК", 0);
            }
        } else new View().getInfo(this, null, " Убит", 0);

    }

}