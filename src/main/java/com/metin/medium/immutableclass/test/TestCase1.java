package com.metin.medium.immutableclass.test;

import com.metin.medium.immutableclass.models.case1.PersonForCase1;

public class TestCase1 {

    public static void main(String[] args) {
        PersonForCase1 personForCase1 = new PersonForCase1("metin", "alnıaçık");
        System.out.println(personForCase1);
        // Bu sınıfın değerleri hiçbir şekilde değiştiremezsiniz.
    }
}
