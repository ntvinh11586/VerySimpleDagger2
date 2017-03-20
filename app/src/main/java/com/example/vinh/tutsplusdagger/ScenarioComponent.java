package com.example.vinh.tutsplusdagger;

import com.example.vinh.tutsplusdagger.Models.Scenario;
import com.example.vinh.tutsplusdagger.Modules.ScenarioModule;

import java.util.Date;

import javax.inject.Named;

import dagger.Component;

@Component(modules = {ScenarioModule.class})
public interface ScenarioComponent {
    void inject(Scenario scenario);

    @Named("scenarioName")
    String getScenarioName();

    Date getDate();
}
