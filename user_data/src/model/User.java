package model;

import java.util.Date;

public class User {
    protected String surname;
    protected String name;
    protected String patronymic;
    protected String date_birth;
    protected long phone_number;
    protected String gender;


    public User(String surname,
                String name,
                String patronymic,
                String date_birth,
                long phone_number,
                String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.date_birth = date_birth;
        this.phone_number = phone_number;
        this.gender = gender;
    }

    public User() {
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setDate_birth(String date_birth) {
        this.date_birth = date_birth;
    }

    public void setPhone_number(long phone_number) {
        this.phone_number = phone_number;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDate_birth() {
        return date_birth;
    }

    public long getPhone_number() {
        return phone_number;
    }

    public String getGender() {
        return gender;
    }
}

