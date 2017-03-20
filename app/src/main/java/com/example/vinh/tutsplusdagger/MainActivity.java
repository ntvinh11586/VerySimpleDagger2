package com.example.vinh.tutsplusdagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.vinh.tutsplusdagger.Models.GameSession;
import com.example.vinh.tutsplusdagger.Models.Scenario;
import com.example.vinh.tutsplusdagger.Modules.GameModule;
import com.example.vinh.tutsplusdagger.Modules.ScenarioModule;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "VerySimpleDagger2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GameSession session = new GameSession();
        Scenario scenario = new Scenario();

        // Allow only GameModule() with empty params on constructor
        // DaggerGameComponent.create().inject(session);
        GameComponent gameComponent = DaggerGameComponent.builder()
                .gameModule(new GameModule("John", "Jackie", "Hard"))
                .scenarioModule(new ScenarioModule("Scenario", new Date()))
                .build();
        gameComponent.injectGameSession(session);
        gameComponent.injectScenario(scenario);

        Log.d(TAG, gameComponent.getNewPlayer1().getPlayer());
        Log.d(TAG, gameComponent.getNewPlayer2().getPlayer());
        Log.d(TAG, gameComponent.getPlayMode());
        Log.d(TAG, String.valueOf(gameComponent.getRandomInt()));

        Log.d(TAG, session.newPlayer1.getPlayer());
        Log.d(TAG, session.newPlayer2.getPlayer());
        Log.d(TAG, session.playMode);

        Log.d(TAG, scenario.scenarioName);
        Log.d(TAG, scenario.date.toString());
    }
}
