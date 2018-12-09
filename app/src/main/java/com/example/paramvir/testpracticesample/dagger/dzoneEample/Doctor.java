package com.example.paramvir.testpracticesample.dagger.dzoneEample;

import dagger.Component;

@Component(modules = RandomInjectionModule.class)
public interface Doctor {

    Body injectBlood();
}
