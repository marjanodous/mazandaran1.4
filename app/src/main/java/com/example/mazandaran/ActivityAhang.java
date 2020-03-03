package com.example.mazandaran;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class ActivityAhang extends AppCompatActivity {
    private ImageButton forwardbtn, backwardbtn, pausebtn, playbtn;
    private MediaPlayer music;
    private TextView  startTime, songTime,txtMatnSoal;
    private SeekBar seekBar;
    private static int oTime =0, sTime =0, eTime =0, fTime = 5000, bTime = 5000;
    private Handler hdlr = new Handler();
    public static int position;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.play_music);

        txtMatnSoal = findViewById(R.id.txt_matnsoal);
        backwardbtn = findViewById(R.id.btnBackward);
        forwardbtn =findViewById(R.id.btnForward);
        playbtn = findViewById(R.id.btnPlay);
        pausebtn = findViewById(R.id.btnPause);
        startTime = findViewById(R.id.txtStartTime);
        songTime = findViewById(R.id.txtSongTime);
        seekBar = findViewById(R.id.sBar);
        seekBar.setClickable(false);
        pausebtn.setEnabled(false);


        /* get values from intent */
        Bundle bundle = getIntent().getExtras();
        txtMatnSoal.setText(bundle.getString("music_name"));
        position = bundle.getInt("pos");

        if(position==0){
            music = MediaPlayer.create(ActivityAhang.this, R.raw.music1);
            music.start();
            setPlayAction();
        }
        else if(position==1){
            music = MediaPlayer.create(ActivityAhang.this, R.raw.music2);
            music.start();
            setPlayAction();
        }
        else if(position==2){
            music = MediaPlayer.create(ActivityAhang.this, R.raw.music3);
            music.start();
            setPlayAction();
        }
        else if(position==3){
            music = MediaPlayer.create(ActivityAhang.this, R.raw.music4);
            music.start();
            setPlayAction();
        }

        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(ActivityJoziat.this, "Playing Audio", Toast.LENGTH_SHORT).show();
                music.start();
                eTime = music.getDuration();
                sTime = music.getCurrentPosition();
                if(oTime == 0){
                    seekBar.setMax(eTime);
                    oTime =1;
                }
                songTime.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(eTime),
                        TimeUnit.MILLISECONDS.toSeconds(eTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS. toMinutes(eTime))) );
                startTime.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(sTime),
                        TimeUnit.MILLISECONDS.toSeconds(sTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS. toMinutes(sTime))) );
                seekBar.setProgress(sTime);
                hdlr.postDelayed(UpdateSongTime, 100);
                pausebtn.setEnabled(true);
                playbtn.setEnabled(false);
            }
        });
        pausebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.pause();
                pausebtn.setEnabled(false);
                playbtn.setEnabled(true);
//                Toast.makeText(getApplicationContext(),"Pausing Audio", Toast.LENGTH_SHORT).show();
            }
        });
        forwardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((sTime + fTime) <= eTime)
                {
                    sTime = sTime + fTime;
                    music.seekTo(sTime);
                }
                else
                {
//                    Toast.makeText(getApplicationContext(), "Cannot marasem0 forward 5 seconds", Toast.LENGTH_SHORT).show();
                }
                if(!playbtn.isEnabled()){
                    playbtn.setEnabled(true);
                }
            }
        });
        backwardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((sTime - bTime) > 0)
                {
                    sTime = sTime - bTime;
                    music.seekTo(sTime);
                }
                else
                {
//                    Toast.makeText(getApplicationContext(), "Cannot marasem0 backward 5 seconds", Toast.LENGTH_SHORT).show();
                }
                if(!playbtn.isEnabled()){
                    playbtn.setEnabled(true);
                }
            }
        });
    }
    private Runnable UpdateSongTime = new Runnable() {
        @Override
        public void run() {
            sTime = music.getCurrentPosition();
            startTime.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(sTime),
                    TimeUnit.MILLISECONDS.toSeconds(sTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(sTime))) );
            seekBar.setProgress(sTime);
            hdlr.postDelayed(this, 100);
        }
    };
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        music.pause();
        oTime =0;
        sTime =0;
        eTime =0;

    }
    public void setPlayAction(){
        eTime = music.getDuration();
        sTime = music.getCurrentPosition();
        if(oTime == 0){
            seekBar.setMax(eTime);
            oTime =1;
        }
        songTime.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(eTime),
                TimeUnit.MILLISECONDS.toSeconds(eTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS. toMinutes(eTime))) );
        startTime.setText(String.format("%d min, %d sec", TimeUnit.MILLISECONDS.toMinutes(sTime),
                TimeUnit.MILLISECONDS.toSeconds(sTime) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS. toMinutes(sTime))) );
        seekBar.setProgress(sTime);
        hdlr.postDelayed(UpdateSongTime, 100);
        pausebtn.setEnabled(true);
        playbtn.setEnabled(false);
    }
}