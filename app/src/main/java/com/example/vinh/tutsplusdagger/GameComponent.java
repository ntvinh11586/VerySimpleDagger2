package com.example.vinh.tutsplusdagger;

import javax.inject.Named;

import dagger.Component;

@Component(modules = GameModule.class)
public interface GameComponent {
    void inject(GameSession obj);

    @Named("newPlayer1")
    GameData getNewPlayer1();

    @Named("newPlayer2")
    GameData getNewPlayer2();

    String getPlayMode();
}