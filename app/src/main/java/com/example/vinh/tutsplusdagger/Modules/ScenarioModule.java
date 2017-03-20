package com.example.vinh.tutsplusdagger.Modules;

import java.util.Date;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ScenarioModule {
    String name;
    Date date;

    public ScenarioModule(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    @Provides
    @Named("scenarioName")
    String providesName() {
        return name;
    }

    @Provides
    Date providesDate() {
        return date;
    }
}
