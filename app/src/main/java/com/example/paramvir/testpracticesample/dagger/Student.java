package com.example.paramvir.testpracticesample.dagger;

import javax.inject.Inject;

public class Student extends Person {
    String rollNo;

    @Inject
    public Student(String rollNo, String name, String id, String phone) {
        super(name, id, phone);
        this.rollNo = rollNo;
    }
}
