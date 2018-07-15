package tech.rtsproduction.musicplayer;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongActivity extends AppCompatActivity {

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
        getSupportActionBar().setTitle("Songs");

        ArrayList<SongsData> artistList = new ArrayList<>();
        artistList.add(new SongsData(getString(R.string.song1),"ChainSmoker&Coldplay","2017"));
        artistList.add(new SongsData(getString(R.string.song2),"Coldplay","2015"));
        artistList.add(new SongsData(getString(R.string.song3),"Sale el Sol","2010"));
        artistList.add(new SongsData(getString(R.string.song4),"Unknown","2016"));
        artistList.add(new SongsData(getString(R.string.song5),"Divide","2017"));
        artistList.add(new SongsData(getString(R.string.song6),"Fifty Shades of Grey","2015"));
        artistList.add(new SongsData(getString(R.string.song7),"Fifty Shades Freed","2018"));
        artistList.add(new SongsData(getString(R.string.song8),"Collage","2016"));
        artistList.add(new SongsData(getString(R.string.song9),"Zayn","2018"));
        artistList.add(new SongsData(getString(R.string.song10),"Chord Overstreet","2017"));
        artistList.add(new SongsData(getString(R.string.song11),"Camilla","2018"));

        SongsAdapter adapter = new SongsAdapter(this,artistList);
        listView.setAdapter(adapter);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.playingMenu:{
                        startActivity(new Intent(SongActivity.this,PlayingActivity.class));
                        break;
                    }
                    case R.id.settingMenu:{
                        startActivity(new Intent(SongActivity.this,SettingsActivity.class));
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
