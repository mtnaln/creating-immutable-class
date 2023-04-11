package com.metin.medium.immutableclass.models.case4;

import com.metin.medium.immutableclass.models.case3.ExtraInformationsAsMutable;

public final class PersonForCase4 {

    private final String name;
    private final String surname;

    private final ExtraInformationsAsMutable extraInformationsAsMutable;

    public PersonForCase4(String name, String surname, ExtraInformationsAsMutable extraInformationsAsMutable) {
        this.name = name;
        this.surname = surname;

        ExtraInformationsAsMutable temp = new ExtraInformationsAsMutable(extraInformationsAsMutable.getAge());
        this.extraInformationsAsMutable = temp;
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
        return "PersonForCase4{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", extraInformations=" + extraInformationsAsMutable +
                '}';
    }
}
