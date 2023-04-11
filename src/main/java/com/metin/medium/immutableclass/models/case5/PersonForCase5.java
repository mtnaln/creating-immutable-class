package com.metin.medium.immutableclass.models.case5;

import com.metin.medium.immutableclass.models.case3.ExtraInformationsAsMutable;

public final class PersonForCase5 {

    private final String name;
    private final String surname;

    private final ExtraInformationsAsMutable extraInformationsAsMutable;

    public PersonForCase5(String name, String surname, ExtraInformationsAsMutable extraInformationsAsMutable) {
        this.name = name;
        this.surname = surname;
        this.extraInformationsAsMutable = new ExtraInformationsAsMutable(extraInformationsAsMutable.getAge());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public ExtraInformationsAsMutable getExtraInformationsAsMutable() {
        return new ExtraInformationsAsMutable(extraInformationsAsMutable.getAge());
    }

    @Override
    public String toString() {
        return "PersonForCase5{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", extraInformations=" + extraInformationsAsMutable +
                '}';
    }
}
