package Game_HW.Person;


/**
 * Крестьянин
 * pitchfork - вилы
 */
public class Peasant extends Person {
    public Peasant( int age, String name) {
        super(5, 50, 50,
                40, 10, 15,
                "Pitchfork", age, name);
    }
}