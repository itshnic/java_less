import java.util.ArrayList;
import java.util.List;

public class task4 {
    static List<ArrayList<String>> cat  = new ArrayList<>();

    public static void main(String[] args) {

        addBook("Фантастика", "...");
        addBook("Фантастика","assa");
        addBook("Детектив", "Десять негритят");
        addBook("Фантастика","Звездные короли");
        System.out.println(cat);
    }

    static void addBook(String genre, String book)
    {
        ArrayList<String> cur = null;
        for (ArrayList<String> s : cat)
        {
            if (s.get(0).equals(genre))
            {
                cur = s;
                cur.add(book);
                return;
            }
        }
        cur = new ArrayList<>();
        cur.add(genre);
        cat.add(cur);
        cur.add(book);
    }
}
