package com.metin.medium.immutableclass.models.case2;

public final class PersonForCase2 {

    private final String name;
    private final String surname;

    private final ExtraInformations extraInformations;

    public PersonForCase2(String name, String surname, ExtraInformations extraInformations) {
        this.name = name;
        this.surname = surname;
        this.extraInformations = extraInformations;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ExtraInformations getExtraInformations() {
        return extraInformations;
    }

    @Override
    public String toString() {
        return "PersonForCase2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", extraInformations=" + extraInformations +
                '}';
    }
}
