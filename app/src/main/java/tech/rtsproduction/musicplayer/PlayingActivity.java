package tech.rtsproduction.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayingActivity extends AppCompatActivity {

    Button downBtn,playBtn;
    Boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playing);

        downBtn = findViewById(R.id.slideDownBtn);
        playBtn = findViewById(R.id.playBtn);

        downBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying){
                    playBtn.setBackgroundResource(R.mipmap.pausebtn_foreground);
                }else{
                    playBtn.setBackgroundResource(R.mipmap.playbtn);
                }
                isPlaying = !isPlaying;
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in,R.anim.slide_out);
    }
}
