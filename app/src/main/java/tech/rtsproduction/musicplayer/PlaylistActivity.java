package tech.rtsproduction.musicplayer;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaylistActivity extends AppCompatActivity {

    ListView listView;
    BottomNavigationView navigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        listView = findViewById(R.id.listviewArtist);
        navigationView = findViewById(R.id.menuNavigationMusic);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Playlists");

        ArrayList<SongsData> playlistData = new ArrayList<>();
        playlistData.add(new SongsData("",getString(R.string.playlist1),""));
        playlistData.add(new SongsData("",getString(R.string.playlist2),""));
        playlistData.add(new SongsData("",getString(R.string.playlist3),""));
        playlistData.add(new SongsData("",getString(R.string.playlist4),""));

        SongsAdapter adapter = new SongsAdapter(this,playlistData);
        listView.setAdapter(adapter);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.playingMenu:{
                        startActivity(new Intent(PlaylistActivity.this,PlayingActivity.class));
                        break;
                    }
                    case R.id.settingMenu:{
                        startActivity(new Intent(PlaylistActivity.this,SettingsActivity.class));
                        break;
                    }
                    case R.id.homeMenu:{
                        finish();
                        break;
                    }
                }
                return false;
            }
        });
    }
}
