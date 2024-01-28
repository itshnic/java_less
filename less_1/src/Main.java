
class Answer {
    public int countNTriangle(int n){
        int summ=0;
        for (int i=1; i<=n; i++) {
            summ+=i;
        }
        return summ;
    }
}
public class Main{
    public static void main(String[] args) {
        int n = 0;
        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 4;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}