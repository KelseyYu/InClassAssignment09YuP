package com.example.mac.inclassassignment09_yup;


public class Person {
    private String name;
    private int age;
    private boolean gradHS;

    public Person(String name, int age, boolean gradHS) {
        this.name = name;
        this.age = age;
        this.gradHS = gradHS;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isGradHS() {
        return gradHS;
    }
}
