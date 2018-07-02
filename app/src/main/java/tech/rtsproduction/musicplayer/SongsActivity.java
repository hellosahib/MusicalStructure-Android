package tech.rtsproduction.musicplayer;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class SongsActivity extends AppCompatActivity {

    Button playlistBtn,songsBtn,artistBtn,albumBtn;
    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        playlistBtn = findViewById(R.id.playlistBtn);
        songsBtn = findViewById(R.id.songsBtn);
        artistBtn = findViewById(R.id.artistBtn);
        albumBtn = findViewById(R.id.albumBtn);
        navigationView = findViewById(R.id.menuNavigation);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Toast.makeText(SongsActivity.this, item.getItemId(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });


    }
}
