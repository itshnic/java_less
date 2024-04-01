package Game_HW.Presenter;

import Game_HW.Model.*;
import Game_HW.View.View;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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


    public boolean victory(HashMap<String,ArrayList<Person>> teams) {
        for (Map.Entry<String,ArrayList<Person>> entry : teams.entrySet()){
            if (!getTeamKilled(entry.getValue())) {
                new View().messageToWinner(teams,entry.getKey());
                return false;
            }
        }
        return true;
    }

}
