package Game_HW.Model;

import Game_HW.Presenter.Search;

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
            Search search = new Search();
            Person opponent = search.searchOpponent(opponentTeam, this.positionX, this.positionY);
            this.attack(opponent);
            this.shot--;
        } else if (this.health == 0) {
            System.out.println(this.toString() + " --> Game over");
        } else if (this.shot == 0) {
            System.out.println(this.toString() + " --> Выстрелы закончились!!!");
        }
    }
}
