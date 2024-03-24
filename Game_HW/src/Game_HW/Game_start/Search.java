package Game_HW.Game_start;

import Game_HW.Person.Person;

import java.util.ArrayList;

/**
 * Поиск игрока в команде
 */
public class Search {
    /**
     * Поиск персонажа в команде по его имени
     * @param team
     * @param name
     * @return
     */
    public Person searchPerson(ArrayList<Person> team, String name) {
        Person personName = null;
        for (Person person : team) {
            if (person.getClass().getSimpleName().equals(name)) {
                personName = person;
            }
        }
        return personName;
    }

    /**
     * Поиск ближайшего соперника
     *
     * @param team - команда соперников
     * @return - соперник
     */
    public Person searchOpponent(ArrayList<Person> team, int x, int y) {
        Person opponent = team.getFirst();
        Coordinate coord = new Coordinate(x,y);
        double minDistance = coord.distance(team.getFirst());

        for (int i = 1; i < team.size(); i++) {
            double distance = coord.distance(team.get(i));
            if (minDistance > distance) {
                minDistance = distance;
                opponent = team.get(i);
            }
        }
        return opponent;
    }
}
