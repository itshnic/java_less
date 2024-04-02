package Game_HW.Presenter.Person;

import Game_HW.Model.Person;
import Game_HW.Presenter.Search;
import Game_HW.View.View;

import java.util.ArrayList;

/**
 * Crossbowman - Арбалетчик
 * Balester - Арбалет
 */
public class Crossbowman extends Person {
    int arrow;

    public Crossbowman(Integer age,
                       String name,
                       int positionX,
                       int positionY) {
        super(15, 90, 100,
                80, 50, 30,
                "Balester",
                age, name, 3,
                positionX, positionY);
        this.arrow = 120;
    }

    @Override
    public void step(ArrayList<Person> opponentTeam, ArrayList<Person> myTeam) {
        if (this.health > 0 && this.arrow > 0) {
            Person opponent = new Search().searchOpponent(opponentTeam,this.positionX,this.positionY);
            new View().getInfo(this,opponent," Атака", this.attack(opponent));
            this.arrow--;
        } else if (this.health == 0) {
            new View().getInfo(this,null," Убит", 0);
        } else if (this.arrow == 0) {
            new View().getInfo(this,null," Стерлы закончились", 0);
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()
                + " --> "
                + this.name
                + " /"
                + this.age
                + " лет /"
                + this.health
                + " жизнь /"
                + this.arrow
                + " стрел /"
                + "Позиция X="
                + this.positionX
                + " Y="
                + this.positionY
                + " /"
                + this.speed;
    }
}

