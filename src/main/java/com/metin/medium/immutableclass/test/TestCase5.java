package com.metin.medium.immutableclass.test;

import com.metin.medium.immutableclass.models.case3.ExtraInformationsAsMutable;
import com.metin.medium.immutableclass.models.case4.PersonForCase4;
import com.metin.medium.immutableclass.models.case5.PersonForCase5;

public class TestCase5 {

    public static void main(String[] args) {
        ExtraInformationsAsMutable extraInformationsAsMutable = new ExtraInformationsAsMutable(30);
        PersonForCase5 personForCase5 = new PersonForCase5("metin", "alnıaçık", extraInformationsAsMutable);
        System.out.println(personForCase5);

        extraInformationsAsMutable.setAge(40); // constructor'da engelliyoruz.

        System.out.println(personForCase5);

        personForCase5.getExtraInformationsAsMutable().setAge(50); // // bu kısmı da engelliyoruz.

        System.out.println(personForCase5);
    }
}
