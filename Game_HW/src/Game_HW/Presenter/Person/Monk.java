package Game_HW.Presenter.Person;

import Game_HW.Model.Person;

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
    /**
     * Востановление здоровья за счет mana
     *
     * @param person
     */
    public void hail(Person person) {
        if (this.mana >= 10) {
            person.health += (int) (this.mana * 0.1);
            this.mana -= (int) (this.mana * 0.1);

        } else System.out.println(this.getClass().getSimpleName() + " Лечить нельзя Mana -> " + this.mana);
    }

}
