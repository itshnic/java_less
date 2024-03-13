import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        task1();
        task0();
    }
    static void task0(){
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list1.add(0,i);
        }
        long middle = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list2.add(0,i);
        }
        long finish = System.currentTimeMillis();
        System.out.println(middle - start);
        System.out.println(finish - middle);
    }

    static void task1(){
        LinkedList<String> list = new LinkedList<>();
        boolean work = true;
        Scanner scanner = new Scanner(System.in);
        while (work){
            System.out.println("Введите команду(text~num) ");
            String line = scanner.nextLine();
            if(line.equals("exit")){
                System.out.println("Пока!");
                return;
            }
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text){
                case "print" :
                    System.out.println(list.remove(num));
                    break;
                default:
                    list.add(num, text);
            }
        }
    }
}
