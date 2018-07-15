package tech.rtsproduction.musicplayer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button playlistBtn, songsBtn, artistBtn, albumBtn;
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playlistBtn = findViewById(R.id.playlistBtn);
        songsBtn = findViewById(R.id.songsBtn);
        artistBtn = findViewById(R.id.artistBtn);
        albumBtn = findViewById(R.id.albumBtn);
        navigationView = findViewById(R.id.menuNavigationHome);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.playingMenu: {
                        startActivity(new Intent(MainActivity.this, PlayingActivity.class));
                        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                        break;
                    }
                    case R.id.settingMenu: {
                        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                        break;
                    }
                }
                return false;
            }
        });
    }

    public void buttonOnClick(View v){
        switch (v.getId()){
            case R.id.playlistBtn:{
                startActivity(new Intent(MainActivity.this, PlaylistActivity.class));
                break;
            }
            case R.id.songsBtn:{
                startActivity(new Intent(MainActivity.this, SongActivity.class));
                break;
            }
            case R.id.artistBtn:{
                startActivity(new Intent(MainActivity.this, ArtistActivity.class));
                break;
            }
            case R.id.albumBtn:{
                startActivity(new Intent(MainActivity.this, AlbumActivity.class));
                break;
            }
        }
    }
}
