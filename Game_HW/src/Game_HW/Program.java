package Game_HW;

import Game_HW.Game_start.Coordinate;
import Game_HW.Game_start.Search;
import Game_HW.Game_start.Teams;
import Game_HW.Person.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Teams team = new Teams();
//        ArrayList<Person> blackTeam = team.createTeam(10, 0, 0);
//        ArrayList<Person> whiteTeam = team.createTeam(10, 3, 9);
        ArrayList<Person> blackTeam = new ArrayList<>();
        ArrayList<Person> whiteTeam = new ArrayList<>();
        blackTeam.add(new Monk(20, "Иван",0,1));
        blackTeam.add(new Robber(25, "Игорь",1,1));
//        blackTeam.add(new Monk(20, "Иван",0,3));
        blackTeam.add(new Sniper(23, "Илья",0,4));
        whiteTeam.add(new Sniper(26, "Соня",9,1));

        System.out.println("Команда blackTeam");
        blackTeam.forEach(System.out::println);
        System.out.println();

        System.out.println("Команда whiteTeam");
        whiteTeam.forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");

        Search search = new Search();
        Person Monk =search.searchPerson(blackTeam,"Monk");
//        Person Sniper = search.searchPerson(blackTeam,"Sniper");
        ArrayList<Person>listGamerNear = search.searchGamer(whiteTeam,Monk);

        System.out.println("Игрок: "+Monk);
//        System.out.println("Игрок: "+Sniper);
        System.out.println();

        System.out.println("Противник: "+listGamerNear.get(0));
        System.out.println();

        Monk.step(whiteTeam,blackTeam);
//        Crossbowman.step(whiteTeam,blackTeam);


//        ArrayList<Person> allGamers = new ArrayList<>();
//        allGamers.addAll(blackTeam);
//        allGamers.addAll(whiteTeam);
//        allGamers.sort(((o1, o2) -> o2.speed- o1.speed));
//        allGamers.forEach(System.out::println);
    }
}
