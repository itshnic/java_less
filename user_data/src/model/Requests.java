package model;

public enum Requests {
    request1("имя",10, 0),
    request2("фамилию",15, 0),
    request3("отчество",10, 0),
    request4("день рождения",2, 1),
    request5("месяц рождения",2, 1),
    request6("год рождения",4, 1),
    request7("телефон с кодом страны 8",11, 1),
    request8("ваш пол f (Ж) или m (M)",1, 2);

    public final String text;
    public final int number;
    public final int check;


    Requests(String text, int number, int check) {
        this.text = text;
        this.number = number;
        this.check = check;
    }
}
