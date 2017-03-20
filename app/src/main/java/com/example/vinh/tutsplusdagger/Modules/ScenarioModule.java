package com.example.vinh.tutsplusdagger.Modules;

import com.example.vinh.tutsplusdagger.Models.Scenario;

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
    Scenario providesScenario() {
        return new Scenario(name, date);
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
