package com.metin.medium.immutableclass.models.case2;

public final class ExtraInformations {
    private final Integer age;

    public ExtraInformations(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "ExtraInformations{" +
                "age=" + age +
                '}';
    }
}
