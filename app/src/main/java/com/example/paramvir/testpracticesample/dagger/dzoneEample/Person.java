package com.example.paramvir.testpracticesample.dagger.dzoneEample;

import javax.inject.Inject;

public class Person {

    Body body;

    @Inject
    public Person(Body body){
        this.body = body;
    }
}
