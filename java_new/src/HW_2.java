import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HW_2 {

    public static void sort(int[] mas) {
        try {
            //BufferedWriter log = new BufferedWriter(new FileWriter("log1.txt"));
            FileWriter log = new FileWriter("log.txt",true);
            DateFormat dateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
            Date date = new Date();
            int number = 0;
            for (int i = 0; i < mas.length - 1; i++) {
                for (int j = 0; j < mas.length - 1; j++) {
                    if (mas[j] > mas[j + 1]) {
                        number = mas[j];
                        mas[j] = mas[j + 1];
                        mas[j + 1] = number;
                        //log.write(dateFormat.format(date)+" "+Arrays.toString(mas));
                        log.write(Arrays.toString(mas));

                        System.out.println(dateFormat.format(date)+" "+Arrays.toString(mas));
                    }

                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }


    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    public static void main(String[] args) {
        int[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }


        sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}