import java.time.LocalTime;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        task1();

    }
    private static void task1() {
        LocalTime locTime = LocalTime.now();
        int hour = locTime.getHour();
        if(hour>=5 && hour<12) System.out.println("Доброе утро " + hour);
        else if(hour<18) System.out.println("Добрый день " + hour);
        else if(hour<23) System.out.println("Добрый вечер " + hour);
        else System.out.println("Доброй ночи " + hour);
    }
}