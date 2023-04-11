package com.metin.medium.immutableclass.models.case1;

public final class PersonForCase1 {

    private final String name;
    private final String surname;

    public PersonForCase1(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "PersonForCase1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
