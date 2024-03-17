package Game_HW.Game_start;

public enum Names {
    gamer1("Роман", 32),
    gamer2("Женя", 30),
    gamer3("Таня", 29),
    gamer4("Нина", 32),
    gamer5("Александр", 38),
    gamer6("Ольга", 28),
    gamer7("Денис", 26),
    gamer8("Игорь", 23),
    gamer9("Антон", 26),
    gamer10("Виктор", 23);

    final String name;
    final int age;
    Names(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
