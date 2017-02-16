package com.example.vinh.tutsplusdagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "VerySimpleDagger2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GameSession session = new GameSession();

//        Allow only GameModule() with empty params on constructor
//        DaggerGameComponent.create().inject(session);

        DaggerGameComponent.builder()
                .gameModule(new GameModule("John", "Jackie", "Hard"))
                .build()
                .inject(session);

        Log.d(TAG, session.newPlayer1.getPlayer());
        Log.d(TAG, session.newPlayer2.getPlayer());
        Log.d(TAG, session.gameMode);
    }
}
