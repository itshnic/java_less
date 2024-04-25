package model;

public enum Requests {
    request1("имя",10),
    request2("фамилию",15),
    request3("отчество",10),
    request4("день рождения",2),
    request5("месяц рождения",2),
    request6("год рождения",4),
    request7("телефон с кодом страны 8",11),
    request8("ваш пол f или m",1);

    public final String text;
    public final int number;


    Requests(String text, int number) {
        this.text = text;
        this.number = number;
    }
}
