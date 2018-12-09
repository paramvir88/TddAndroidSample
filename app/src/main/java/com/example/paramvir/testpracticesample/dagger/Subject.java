package com.example.paramvir.testpracticesample.dagger;

import javax.inject.Inject;

public class Subject {
    String name;
    String id;
    @Inject
    public Subject(String name, String id){
        this.name  = name;
        this.id = id;
    }

}
