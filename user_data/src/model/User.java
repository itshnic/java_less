package model;

import java.util.Date;

public abstract class User {
    protected String surname;
    protected String name;
    protected String patronymic;
    protected Date date_birth;
    protected int phone_number;
    protected char gender;


    public User(String surname, String name, String patronymic, Date date_birth, int phone_number, char gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date_birth = date_birth;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.surname
                + " "
                + this.name
                + " "
                + this.patronymic
                + " "
                + this.date_birth
                + " "
                + this.phone_number
                + " "
                + this.gender;
    }
}

