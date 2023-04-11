package com.metin.medium.immutableclass.test;

import com.metin.medium.immutableclass.models.case3.ExtraInformationsAsMutable;
import com.metin.medium.immutableclass.models.case4.PersonForCase4;

public class TestCase4 {

    public static void main(String[] args) {
        ExtraInformationsAsMutable extraInformationsAsMutable = new ExtraInformationsAsMutable(30);
        PersonForCase4 personForCase4 = new PersonForCase4("metin", "alnıaçık", extraInformationsAsMutable);
        System.out.println(personForCase4);

        extraInformationsAsMutable.setAge(40); // constructor'da engelliyoruz.

        System.out.println(personForCase4);

        personForCase4.getExtraInformationsAsMutable().setAge(50); // bu kısım açık olduğu için değer değişebilir.

        System.out.println(personForCase4);
    }
}
