import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        task2();
    }

    static void task2() {
        List list = new ArrayList<>();
        list.add("asdf");
        list.add(10);
        list.add(10.03);
        list.add("assdfdf");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
