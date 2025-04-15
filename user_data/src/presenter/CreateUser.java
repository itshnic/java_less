package presenter;

import com.sun.net.httpserver.Request;
import model.Requests;
import model.User;
import view.View;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class CreateUser {
    public String request(String text, Requests e) {
        View view = new View();
        String answer = null;
        boolean flag = true;
        while (flag) {
            view.viewRequest(text + " " + e.text);
            Scanner isScanner = new Scanner(System.in);
            answer = isScanner.nextLine();

            switch (e.check) {
                case 0:
                    if (e.number >= answer.length()) {
                        flag = false;
                    } else view.viewRequest("Количество символов > "+e.number);
                    break;
                case 1:
                    if (e.number == answer.length() && isNumber(answer)) {
                        flag = false;
                    } else view.viewRequest(e.text+ " состоит из "+ e.number +"-х цифр без букв и символов!");
                    break;
                case 2:
                    if (answer.equals("f") || answer.equals("m")) {
                        flag = false;
                    } else view.viewRequest("ваш пол f (Ж) или m (M)");
                    break;
            }
        }
        return answer;
    }
    public static boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("dd.MM.yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
    public User create(String text) {
        ArrayList<String> list = new ArrayList<>();
        User user = new User();
        for (Requests e : Requests.values()) {
            list.add(request(text, e));
        }
        user.setName(list.get(0));
        user.setSurname(list.get(1));
        user.setPatronymic(list.get(2));
        user.setDate_birth(list.get(3)+"."+list.get(4)+"."+list.get(5));
        user.setPhone_number(Long.parseLong(list.get(6)));
        user.setGender(list.get(7));
        return user;
    }

}





