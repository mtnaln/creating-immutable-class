package com.metin.medium.immutableclass.models.case3;

public class ExtraInformationsAsMutable {
    private Integer age;

    public ExtraInformationsAsMutable() {
    }

    public ExtraInformationsAsMutable(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ExtraInformations{" +
                "age=" + age +
                '}';
    }
}
