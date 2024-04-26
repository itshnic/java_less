package presenter;

import model.Requests;
import model.User;
import view.View;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class CreateUser {
    public String request(String text, Requests e) {
        View requestView = new View();
        String answer= null;
        boolean flag = true;
        while (flag) {
            requestView.viewRequest(text + " " + e.text);
            try (Scanner isScanner = new Scanner(System.in)) {
                answer = isScanner.nextLine();
            }
            switch (e.check) {
                case 1:
                    if (e.number == answer.length()) {
                        flag = false;
                    } else
                case 0:
                    if (e.number >= answer.length()) {
                        flag = false;
                    } else
            }
        }
        return answer;
    }
}
}

public ArrayList<String> dataList(String text) {
    ArrayList<String> list = new ArrayList<>();


}


}
