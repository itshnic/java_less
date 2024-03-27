package Game_HW.Game_start;

import Game_HW.Person.Person;

import java.util.ArrayList;

/**
 * Поиск игрока в команде
 */
public class Search {
    /**
     * Поиск персонажа в команде по его имени
     *
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
     * Поиск ближайшего игрока
     *
     * @param team - команда
     * @return - список игроков с одинаковой дистанцией
     */
    public ArrayList<Person> searchGamer(ArrayList<Person> team, Person gamer) {
        ArrayList<Person> listGamerNear= new ArrayList<>();
        Person gamerNear = gamer;
        Coordinate coord = new Coordinate(gamer.getPositionX(), gamer.getPositionY());
        double minDistance = 100;

        for (int i = 0; i < team.size(); i++) {
            double distance = coord.distance(team.get(i));
            if(distance==1) listGamerNear.add(team.get(i));
            else if (minDistance > distance && distance > 0)
             {
                minDistance = distance;
                 gamerNear = team.get(i);
            }
        }

        return listGamerNear.add(gamerNear);
    }
}
