package Game_HW;

import Game_HW.Game_start.Coordinate;
import Game_HW.Game_start.Search;
import Game_HW.Game_start.Teams;
import Game_HW.Game_start.View;
import Game_HW.Person.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static ArrayList<Person> blackTeam = new ArrayList<>();
    public static ArrayList<Person> whiteTeam = new ArrayList<>();
    public static ArrayList<Person> allGamers = new ArrayList<>();

    public static void main(String[] args) {

        blackTeam = Teams.createTeam(10, 0, 0);
        whiteTeam = Teams.createTeam(10, 3, 9);
        allGamers.addAll(blackTeam);
        allGamers.addAll(whiteTeam);
        allGamers.sort(((o1, o2) -> o2.speed- o1.speed));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            View.view();
            scanner.nextLine();
            for (Person person: allGamers) {
                if(whiteTeam.contains(person)){
                    person.step(blackTeam, whiteTeam);
                }
                else person.step(whiteTeam,blackTeam);
            }

        }

//        System.out.println("Команда blackTeam");
//        blackTeam.forEach(System.out::println);
//        System.out.println();
//
//        System.out.println("Команда whiteTeam");
//        whiteTeam.forEach(System.out::println);
//        System.out.println();
//
//        Search search = new Search();
//        Person Monk =search.searchPerson(blackTeam,"Monk");
//        Person Crossbowman = search.searchPerson(blackTeam,"Crossbowman");
//        Person opponent = search.searchOpponent(whiteTeam,Monk.getPositionX(), Monk.getPositionY());

//        System.out.println("Игрок: "+Monk);
//        System.out.println("Игрок: "+Crossbowman);
//        System.out.println();
//
//        System.out.println("Противник: "+opponent);
//        System.out.println();

//        Monk.step(whiteTeam,blackTeam);
//        Crossbowman.step(whiteTeam,blackTeam);




//        allGamers.sort(((o1, o2) -> o2.speed- o1.speed));
//        allGamers.forEach(System.out::println);
    }
}
