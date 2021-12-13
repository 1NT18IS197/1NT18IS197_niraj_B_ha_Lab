package com.example.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button play, pause, forward, rewind, stop, restart ;
    TextView title ;
    int starttime = 0 ;
    int stoptime = 0 ;
    int forwardtime = 5000 ;
    int rewindtime = 5000 ;
    EditText songtitle ;
    MediaPlayer mediaPlayer,newmediaPlayer ;

    MediaPlayer createMedia(){
        newmediaPlayer = MediaPlayer.create(this, R.raw.first);
        return newmediaPlayer;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = createMedia();
        title = findViewById(R.id.textView);
        play = findViewById(R.id.play);
        pause =  findViewById(R.id.pause);
        forward = findViewById(R.id.forward);
        rewind = findViewById(R.id.rewind);
        stop = findViewById(R.id.stop);
        restart = findViewById(R.id.restart);
        title.setText("first.mp3");
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PlayingMedia now", Toast.LENGTH_SHORT).show();
                        mediaPlayer.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PlayingMedia now", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentpos = mediaPlayer.getCurrentPosition() ;
                if((currentpos+forwardtime) <= (stoptime = mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos+forwardtime);
                }

            }
        });

        rewind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int currentpos = mediaPlayer.getCurrentPosition() ;
                if((currentpos+rewindtime) <= (stoptime = mediaPlayer.getDuration())){
                    mediaPlayer.seekTo(currentpos+rewindtime);
                }

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "PlayingMedia now", Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();
                mediaPlayer=createMedia();
            }
        });

        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.reset();
                mediaPlayer=createMedia();
                mediaPlayer.start();
            }
        });
    }
}
