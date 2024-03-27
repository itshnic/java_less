package Game_HW.Game_start;

import Game_HW.Person.*;

import java.util.ArrayList;
import java.util.Random;


public class Teams {
    public static ArrayList<Person> createTeam(int countUser, int step, int positionY) {
        ArrayList<Person> team = new ArrayList<>();
        for (int i = 0; i < countUser; i++) {
            var gamer = Names.values()[new Random().nextInt(Names.values().length)];
            switch (new Random().nextInt(4) + step) {
                case 0:
                    team.add(new Monk(gamer.age, gamer.name, i, positionY));
                    break;
                case 1:
                    team.add(new Crossbowman(gamer.age, gamer.name, i, positionY));
                    break;
                case 2:
                    team.add(new Robber(gamer.age, gamer.name, i, positionY));
                    break;
                case 3:
                    team.add(new Peasant(gamer.age, gamer.name, i, positionY));
                    break;
                case 4:
                    team.add(new Sniper(gamer.age, gamer.name, i, positionY));
                    break;
                case 5:
                    team.add(new Sorcerer(gamer.age, gamer.name, i, positionY));
                    break;
                case 6:
                    team.add(new Spearman(gamer.age, gamer.name, i, positionY));
                    break;
            }
        }
        return team;
    }

    private boolean getTeamKilled(ArrayList<Person> team) {
        double summ = 0;
        for (Person human : team) {
            summ += human.getHealth();
        }
        return summ != 0;
    }
    private void message (String name_1,String name_2) {
        System.out.println(name_1 + " GAME OVER!!!");
        System.out.println(name_2 + " Winning Team!!!");
    }

    public boolean victory(ArrayList<Person> team_1, ArrayList<Person> team_2) {
        if (!getTeamKilled(team_1)) {
            message(team_1.getClass().getSimpleName(),team_2.getClass().getSimpleName());
        }
        return getTeamKilled(team_1);
    }
}
