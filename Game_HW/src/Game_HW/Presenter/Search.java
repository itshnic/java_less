package Game_HW.Presenter;

import Game_HW.Model.Person;

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
            if (minDistance > distance&&team.get(i).getHealth()>0) {
                minDistance = distance;
                opponent = team.get(i);
            }
        }
        return opponent;
    }

    /**
     * Поиск игроков по Именам персонажей
     * @param team - команда
     * @param listName - список имен
     * @return список игроков
     */
    public ArrayList<Person> getPersonMyTeam(ArrayList<Person> team, ArrayList<String> listName) {
        ArrayList<Person> filter = new ArrayList<>();
        for (Person person : team) {
            for (String name : listName) {
                if (person.getClass().getSimpleName().equals(name))
                    filter.add(person);
            }
        }
        return filter;
    }
}
