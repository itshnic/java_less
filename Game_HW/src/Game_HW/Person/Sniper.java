package Game_HW.Person;

/**
 * Снайпер
 * rifle - винтовка
 */
public class Sniper extends Person {
    public Sniper( int age, String name,int positionX,int positionY) {
        super(22, 80, 50,
                80, 50, 40,
                "rifle", age, name,positionX,positionY);
    }
}