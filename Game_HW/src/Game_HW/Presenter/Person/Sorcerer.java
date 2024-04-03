package Game_HW.Presenter.Person;

import Game_HW.Model.Person;
import Game_HW.Presenter.Coordinate;
import Game_HW.Presenter.Search;
import Game_HW.View.View;

import java.util.ArrayList;
import java.util.Random;

/**
 * Колдун
 * magic - магия
 */
public class Sorcerer extends Person {
    public Sorcerer(int age,
                    String name,
                    int positionX,
                    int positionY) {
        super(32, 90, 90,
                90, 70, 100,
                "magic", age, name, 1,
                positionX, positionY);
    }

    public void step(ArrayList<Person> opponentTeam, ArrayList<Person> myTeam) {
        if (health > 0) {
            int x = this.positionX;
            int y = this.positionY;
            Person opponent = new Search().searchOpponent(opponentTeam, x, y);
            Coordinate myCoord = new Coordinate(x, y);
            double distanceOpponent = myCoord.distance(opponent);
            ArrayList<Person> searchPersonByHealth = new Search()
                    .searchPersonByHealth(myTeam, this);

            if (distanceOpponent >= 1 && distanceOpponent < 1.5)
                new View().getInfo(this, opponent, "Атака", this.attack(opponent));
            else if (this.flag
                    && this.mana >= 10
                    && !searchPersonByHealth.isEmpty()) {
                Person personHail = searchPersonByHealth
                        .get(new Random().nextInt(searchPersonByHealth.size()));
                this.hail(personHail);
                new View().getInfo(this, personHail, "Лечение", 0);
            } else if (!this.flag
                    && this.mana > 50
                    && !searchPersonByHealth.isEmpty()) {
                Person personRevival = searchPersonByHealth
                        .get(new Random().nextInt(searchPersonByHealth.size()));
                this.revival(personRevival);
                new View().getInfo(this, personRevival, "Возрождение", 0);
            } else {
                new View().getInfo(this, null, " Копит mana", 0);
                this.mana += 50;
            }
        } else new View().getInfo(this, null, " Убит", 0);

    }

    /**
     * Востановление здоровья за счет mana
     *
     * @param person
     */
    public void hail(Person person) {
        person.setHealth(person.getHealth() + 10);
        this.mana -= 10;
        new View().getInfo(this, person, "Лечение", 10);
    }

    /**
     * Возрождение - если в команде убито болле 3-х
     *
     * @param person
     */
    public void revival(Person person) {
        person.setHealth(100);
        this.mana -= 50;
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
                + this.mana
                + " mana /"
                + "Позиция X="
                + this.positionX
                + " Y="
                + this.positionY
                + " /"
                + this.speed;
    }
}