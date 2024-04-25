package presenter;

import model.Requests;
import model.User;
import view.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CreateUser {
    public String request(String text) {
        View requestView = new View();
        boolean flag;
        for(Requests e : Requests.values()) {
            flag = true;
            while (flag) {
                requestView.viewRequest(text+" "+e.text);
                if()
            }

        }

        try (Scanner isScanner = new Scanner(System.in)) {
            return isScanner.nextLine();
        }
    }

    public ArrayList<String> dataList(String text) {
        ArrayList <String> list = new ArrayList<>();



    }


}
