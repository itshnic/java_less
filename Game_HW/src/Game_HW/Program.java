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
<<<<<<< HEAD
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
=======
>>>>>>> d48410bb7f916f988de1eea26ded614fffe4ad4a

        blackTeam = Teams.createTeam(10, 0, 0);
        whiteTeam = Teams.createTeam(10, 3, 9);
        allGamers.addAll(blackTeam);
        allGamers.addAll(whiteTeam);
        allGamers.sort(((o1, o2) -> o2.speed- o1.speed));

<<<<<<< HEAD
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
=======
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


>>>>>>> d48410bb7f916f988de1eea26ded614fffe4ad4a


//        allGamers.sort(((o1, o2) -> o2.speed- o1.speed));
//        allGamers.forEach(System.out::println);
    }
}
