package com.example.vocalesactividad;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    MediaPlayer mp1;
    ImageButton btnvocalEe;
    ImageButton btnvocalA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Vocal A
        btnvocalA=(ImageButton) findViewById(R.id.btnvocalA);
        mp=MediaPlayer.create(this, R.raw.e);
        btnvocalA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp1.start();
            }
        });
        /*Vocal E
        btnvocalEe= (ImageButton) findViewById(R.id.btnvocalEe);
        mp=MediaPlayer.create(this, R.raw.vocalE );
        btnvocalEe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();

            }
});*/

    }
}
