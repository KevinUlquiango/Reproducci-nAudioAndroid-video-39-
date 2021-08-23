package com.example.reproduccinaudioandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button play;
    SoundPool soundPool;
    private int sonido_de_reproductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //audio cortos
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = findViewById(R.id.btn_play);
        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        sonido_de_reproductor = soundPool.load(this,R.raw.sound_short,1);
    }

    //metodo Boton
    public void audioSaundPool(View view){
    soundPool.play(sonido_de_reproductor,1,1,1,0,0);
    }

    //metodo media player

    public void audioMediaPlayer(View view){
        MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.audiolargo);
        mediaPlayer.start();
    }
}