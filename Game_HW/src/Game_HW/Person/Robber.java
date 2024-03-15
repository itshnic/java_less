package Game_HW.Person;

/**
 * Грабитель
 * musket - мушкет
 */
public class Robber extends Person {
    public Robber( int age, String name,int positionX,int positionY) {
        super(17, 50, 50,
                50, 10, 15,
                "musket", age, name,positionX,positionY);
    }
}