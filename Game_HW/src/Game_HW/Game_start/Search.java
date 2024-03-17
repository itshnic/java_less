package Game_HW.Game_start;

import Game_HW.Person.Person;

import java.util.ArrayList;

public class Search {
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
