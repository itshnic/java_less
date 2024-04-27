import model.User;
import presenter.CreateUser;
import presenter.WriterToFile;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new CreateUser().create("Введите");
        WriterToFile write = new WriterToFile();
        write.writeUser(user,
                "C:\\Users\\Пользователь\\Desktop\\GeekBR\\PHP\\phpLesson\\OpenServer\\domains\\java_less\\user_data\\src\\BD\\");

    }
}