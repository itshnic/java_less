import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class HW_2 {

    public static void sort(int[] mas) {
        try (FileWriter log = new FileWriter("log.txt")) {
            //BufferedWriter Bulog = new BufferedWriter(log);
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            Date date = new Date();
            for (int i = 0; i < mas.length; i++) {
                int min = mas[i];
                int minId = i;
                for (int j = i + 1; j < mas.length; j++) {
                    if (mas[j] < min) {
                        min = mas[j];
                        minId = j;
                    }
                }
                int big = mas[i];
                mas[i]=min;
                mas[minId]=big;
                log.write(dateFormat.format(date)
                        + " "
                        + Arrays.toString(mas)
                        + System.getProperty("line.separator"));
            }
        } catch (IOException e) {
            System.out.println("Error");
        }

    }


    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки

    public static void main(@org.jetbrains.annotations.NotNull String[] args) {
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