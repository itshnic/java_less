package Game_HW;

import Game_HW.Model.Person;
import Game_HW.Presenter.Teams;
import Game_HW.View.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Program {
    public static ArrayList<Person> blackTeam = new ArrayList<>();
    public static ArrayList<Person> whiteTeam = new ArrayList<>();
    public static ArrayList<Person> allGamers = new ArrayList<>();

    public static void main(String[] args) {
        blackTeam = Teams.createTeam(10, 0, 0);
        whiteTeam = Teams.createTeam(10, 3, 9);
        HashMap<String,ArrayList<Person>> teams = new HashMap<>();
        teams.put("Black_Team",blackTeam);
        teams.put("White_Team",whiteTeam);
        allGamers.addAll(blackTeam);
        allGamers.addAll(whiteTeam);
        allGamers.sort(((o1, o2) -> o2.speed - o1.speed));

        Scanner scanner = new Scanner(System.in);

        while (new Teams().victory(teams)) {
            View.view();
            scanner.nextLine();
            for (Person person : allGamers) {
                if (whiteTeam.contains(person)) {
                    person.step(blackTeam, whiteTeam);
                } else person.step(whiteTeam, blackTeam);
            }
        }

    }
}
