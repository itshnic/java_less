package Game_HW;

import Game_HW.Game_start.Search;
import Game_HW.Game_start.Teams;
import Game_HW.Person.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Teams team = new Teams();
        ArrayList<Person> blackTeam = team.createTeam(10, 0, 0);
        ArrayList<Person> whiteTeam = team.createTeam(10, 3, 9);

        System.out.println("Команда blackTeam");
        blackTeam.forEach(System.out::println);
        System.out.println();

        System.out.println("Команда whiteTeam");
        whiteTeam.forEach(System.out::println);
        System.out.println();

        Search search = new Search();
        Person gamer = search.searchPerson(blackTeam, "Crossbowman");
        gamer.step(whiteTeam);

        System.out.println("Команда whiteTeam");
        whiteTeam.forEach(System.out::println);
        System.out.println();

        System.out.println("Команда blackTeam");
        blackTeam.forEach(System.out::println);
        System.out.println();
    }
}
