package Game_HW;

import Game_HW.Person.*;

public class Program {
    public static void main(String[] args) {
        Monk monk = new Monk(30, "Сергей");
        Crossbowman crossbowman = new Crossbowman(30, "Владимир");
        Peasant peasant = new Peasant(34, "Инна");
        Robber robber = new Robber(33, "Виктор");
        Sniper sniper = new Sniper(29, "Саша");
        Sorcerer sorcerer = new Sorcerer(40, "Роман");
        Spearman spearman = new Spearman(20, "Игорь");
        sniper.attack(robber);
        peasant.hail(crossbowman);
        sorcerer.attack(spearman);
    }
}
