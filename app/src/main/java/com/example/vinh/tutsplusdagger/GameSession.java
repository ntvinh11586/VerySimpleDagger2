package com.example.vinh.tutsplusdagger;

import javax.inject.Inject;
import javax.inject.Named;

public class GameSession {

    // Enhance example with multiple same type data
    @Inject @Named("newPlayer1")
    public GameData newPlayer1;

    // Enhance example with multiple same type data
    @Inject @Named("newPlayer2")
    public GameData newPlayer2;

    @Inject
    public String playMode;
}