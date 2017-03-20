package com.example.vinh.tutsplusdagger;

import java.util.Random;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class GameModule {
    String newPlayer1;
    String newPlayer2;
    String playMode;

    // Enhance example with custom GameModule (for test)
    public GameModule(String newPlayer1, String newPlayer2, String playMode) {
        this.newPlayer1 = newPlayer1;
        this.newPlayer2 = newPlayer2;
        this.playMode = playMode;
    }

    // Enhance example with multiple same type data
    @Provides
    @Named("newPlayer1")
    GameData providesNewPlayer1() {
        return new GameData(newPlayer1);
    }

    // Enhance example with multiple same type data
    @Provides
    @Named("newPlayer2")
    GameData providesNewPlayer2() {
        return new GameData(newPlayer2);
    }

    @Provides
    String providesPlayMode() {
        return playMode;
    }

    // we can provide anything and get it from Component,
    // not depends on the object which is injected by Component
    @Provides
    int providesRandomInt() {
        return (new Random()).nextInt();
    }
}