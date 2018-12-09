package com.example.paramvir.testpracticesample.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {
    @Provides
    public Student provideStudentWithId(){
        return  new Student("","","", "");
    }
}
