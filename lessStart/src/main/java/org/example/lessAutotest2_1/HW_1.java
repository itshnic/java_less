public class HW_1 {
    public static void main(String[] args) {
        int n = 0;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 5;
        } else {
            n = Integer.parseInt(args[0]);
        }
        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}

class Answer {
    public int countNTriangle(int n) {
        int summ = 0;
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                summ += i;
            }
        } else {
            summ = -1;
        }
        return summ;

    }
}

