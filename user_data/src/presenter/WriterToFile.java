package presenter;

import model.User;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterToFile {
    public void writeUser(User user, String path) {
        try (FileWriter fw = new FileWriter(path+user.getSurname()+".txt", true)){
            fw.write(user.toString());
            fw.append("\n");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
