package com.example.ruinan.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void play (View view) {
        int id = view.getId();
        String ourId = "";
        ourId = view.getResources().getResourceEntryName(id);
        Log.i("button", ourId);
        int resourseId = view.getResources().getIdentifier(ourId, "raw", "com.example.ruinan.basicphrases");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, resourseId);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
