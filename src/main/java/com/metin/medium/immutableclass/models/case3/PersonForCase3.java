package com.metin.medium.immutableclass.models.case3;

public final class PersonForCase3 {

    private final String name;
    private final String surname;

    private final ExtraInformationsAsMutable extraInformationsAsMutable;

    public PersonForCase3(String name, String surname, ExtraInformationsAsMutable extraInformationsAsMutable) {
        this.name = name;
        this.surname = surname;
        this.extraInformationsAsMutable = extraInformationsAsMutable;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ExtraInformationsAsMutable getExtraInformationsAsMutable() {
        return extraInformationsAsMutable;
    }

    @Override
    public String toString() {
        return "PersonForCase3{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", extraInformations=" + extraInformationsAsMutable +
                '}';
    }
}
