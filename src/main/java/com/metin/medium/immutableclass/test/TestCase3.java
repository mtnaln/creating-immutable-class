package com.metin.medium.immutableclass.test;

import com.metin.medium.immutableclass.models.case3.ExtraInformationsAsMutable;
import com.metin.medium.immutableclass.models.case3.PersonForCase3;

public class TestCase3 {

    public static void main(String[] args) {
        ExtraInformationsAsMutable extraInformationsAsMutable = new ExtraInformationsAsMutable(30);
        PersonForCase3 personForCase3 = new PersonForCase3("metin", "alnıaçık", extraInformationsAsMutable);
        System.out.println(personForCase3);

        extraInformationsAsMutable.setAge(40);

        System.out.println(personForCase3);

        personForCase3.getExtraInformationsAsMutable().setAge(50);

        System.out.println(personForCase3);
    }
}
