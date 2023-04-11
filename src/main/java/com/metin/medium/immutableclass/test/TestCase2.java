package com.metin.medium.immutableclass.test;

import com.metin.medium.immutableclass.models.case2.ExtraInformations;
import com.metin.medium.immutableclass.models.case2.PersonForCase2;

public class TestCase2 {

    public static void main(String[] args) {
        ExtraInformations extraInformations = new ExtraInformations(30);
        PersonForCase2 personForCase2 = new PersonForCase2("metin", "alnıaçık", extraInformations);
        System.out.println(personForCase2);
        // PersonForCase2 ve ExtraInformations sınıfları immutable'dir. Bundan dolayı değerleri değiştirilemez.
    }
}
