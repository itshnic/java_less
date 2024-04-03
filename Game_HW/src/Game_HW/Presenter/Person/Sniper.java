package Game_HW.Presenter.Person;

import Game_HW.Model.Person;
import Game_HW.Presenter.Search;
import Game_HW.View.View;

import java.util.ArrayList;

/**
 * Снайпер
 * rifle - винтовка
 */
public class Sniper extends Person {
    int shot;

    public Sniper(int age,
                  String name,
                  int positionX,
                  int positionY) {
        super(22, 80, 50,
                80, 50, 40,
                "rifle", age, name, 3,
                positionX, positionY);
        this.shot = 100;
    }


    @Override
    public void step(ArrayList<Person> opponentTeam, ArrayList<Person> myTeam) {
        if (this.health > 0 && this.shot > 0) {
            Person opponent = new Search().searchOpponent(opponentTeam,this.positionX,this.positionY);
            new View().getInfo(this,opponent,"Атака", this.attack(opponent));
            this.shot--;
        } else if (this.health == 0) {
            new View().getInfo(this,null," Убит", 0);
        } else if (this.shot == 0) {
            new View().getInfo(this,null," Пули закончились", 0);
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
                + this.shot
                + " пуль /"
                + "Позиция X="
                + this.positionX
                + " Y="
                + this.positionY
                + " /"
                + this.speed;
    }
}
