package com.example.vinh.tutsplusdagger;

import com.example.vinh.tutsplusdagger.Models.GameData;
import com.example.vinh.tutsplusdagger.Models.GameSession;
import com.example.vinh.tutsplusdagger.Models.Scenario;
import com.example.vinh.tutsplusdagger.Modules.GameModule;
import com.example.vinh.tutsplusdagger.Modules.ScenarioModule;

import java.util.Date;

import javax.inject.Named;

import dagger.Component;

@Component(modules = {GameModule.class, ScenarioModule.class})
public interface GameComponent {
    void injectGameSession(GameSession obj);
    void injectScenario(Scenario obj);

    @Named("newPlayer1")
    GameData getNewPlayer1();

    @Named("newPlayer2")
    GameData getNewPlayer2();

    @Named("playMode")
    String getPlayMode();

    @Named("scenarioName")
    String getScenarioName();

    Date getDate();

    // not for Data Object models
    int getRandomInt();
}