package Game_HW.Person;

import Game_HW.Game_start.Search;

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
            Search search = new Search();
            Person opponent = search.searchOpponent(opponentTeam,this.positionX,this.positionY);
            this.attack(opponent);
            this.arrow--;
        } else if (this.health == 0) {
            System.out.println(this.toString() + " --> Game over");
        } else if (this.arrow == 0) {
            System.out.println(this.toString() + " --> Стерлы закончились!!!");
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

