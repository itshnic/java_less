package Game_HW;

import Game_HW.Game_start.Teams;
import Game_HW.Person.*;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Teams  team = new Teams();
        ArrayList<Person> blackTeam = team.createTeam(10,0,0);
        ArrayList<Person> whiteTeam = team.createTeam(10,3,9);
        System.out.println(blackTeam);
        System.out.println(whiteTeam);

    }
}
