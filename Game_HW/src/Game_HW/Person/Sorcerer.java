package Game_HW.Person;

/**
 * Колдун
 * magic - магия
 */
public class Sorcerer extends Person {
    public Sorcerer( int age, String name,int positionX,int positionY) {
        super(32, 90, 90,
                90, 70, 100,
                "magic", age, name,positionX,positionY);
    }
}