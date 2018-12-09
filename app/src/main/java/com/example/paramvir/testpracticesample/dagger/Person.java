package com.example.paramvir.testpracticesample.dagger;

import javax.inject.Inject;

public class Person {

    String name;
    String id;
    String phone;
    @Inject
    public Person(String name, String id, String phone){
        this.name  = name;
        this.id = id;
        this.phone = phone;
    }

}
