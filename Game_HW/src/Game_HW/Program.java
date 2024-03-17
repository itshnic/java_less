package Game_HW;

import Game_HW.Game_start.Search;
import Game_HW.Game_start.Teams;
import Game_HW.Person.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Teams  team = new Teams();
        ArrayList<Person> blackTeam = team.createTeam(10,0,0);
        ArrayList<Person> whiteTeam = team.createTeam(10,3,9);

        System.out.println("Команда №1 -->");
        blackTeam.forEach(System.out::println);
        System.out.println();

        System.out.println("Команда №2 -->");
        whiteTeam.forEach(System.out::println);
        Search person = new Search();
        System.out.println();

        Person gamer = person.searchPerson(blackTeam,"Crossbowman");
        Person opponent = person.searchOpponent(whiteTeam,gamer);
        System.out.println("Gamer -> "+gamer);
        System.out.println("Opponent -> "+opponent);
        System.out.println();

        gamer.attack(opponent);
    }
}
