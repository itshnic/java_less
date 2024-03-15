package Game_HW.Game_start;

import Game_HW.Person.*;

import java.util.ArrayList;
import java.util.Random;


public class Teams {
    public ArrayList<Person> createTeam(int countUser, int step, int positionY) {
        ArrayList<Person> team = new ArrayList<>();
        for (int i = 0; i <= countUser; i++) {
            //System.out.println((int) (new Random().nextInt(4)+step));
            switch (new Random().nextInt(4)+step) {
                case 0:
                    team.add(new Monk(30, "Сергей",i,positionY));
                    break;
                case 1:
                    team.add(new Crossbowman(30, "Владимир",i,positionY));
                    break;
                case 2:
                    team.add(new Robber(33, "Виктор",i,positionY));
                    break;
                case 3:
                    team.add(new Peasant(34, "Инна",i,positionY));
                    break;
                case 4:
                    team.add(new Sniper(29, "Саша",i,positionY));
                    break;
                case 5:
                    team.add(new Sorcerer(40, "Роман",i,positionY));
                    break;
                case 6:
                    team.add(new Spearman(20, "Игорь",i,positionY));
                    break;
            }
        }
        return team;
    }
}
