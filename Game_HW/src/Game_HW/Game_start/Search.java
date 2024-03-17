package Game_HW.Game_start;

import Game_HW.Person.Person;

import java.util.ArrayList;


public class Search {
    public Person searchOpponent(ArrayList <Person> team, Person person) {
        double minDistance=Math.sqrt(
                (Math.pow((person.getPositionX()-team.getFirst().getPositionX()),2))
                        + (Math.pow((person.getPositionY()-team.getFirst().getPositionY()),2)));
        Person opponent=team.getFirst();

        for (int i=1;i<team.size();i++) {
            double distance = Math.sqrt(
                    (Math.pow((person.getPositionX() -team.get(i).getPositionX()),2))
                            + (Math.pow((person.getPositionY() - team.get(i).getPositionY()),2)));
            if(minDistance>distance){
                minDistance=distance;
                opponent=team.get(i);
            }
        }
        return opponent;
    }
    public Person searchPerson(ArrayList<Person> team, String name) {
        Person personName =null;
        for(Person person:team){
            if(person.getClass().getSimpleName().equals(name)){
                personName=person;
            }
        }
        return personName;
    }
}
