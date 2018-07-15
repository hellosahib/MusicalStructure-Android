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

public class AlbumActivity  extends AppCompatActivity {

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
        getSupportActionBar().setTitle("Albums");

        ArrayList<SongsData> albumList = new ArrayList<>();
        albumList.add(new SongsData("",getString(R.string.album1),"2016"));
        albumList.add(new SongsData("",getString(R.string.album2),"2016"));
        albumList.add(new SongsData("",getString(R.string.album3),"2017"));
        albumList.add(new SongsData("",getString(R.string.album4),"2018"));

        SongsAdapter adapter = new SongsAdapter(this,albumList);
        listView.setAdapter(adapter);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.playingMenu:{
                        startActivity(new Intent(AlbumActivity.this,PlayingActivity.class));
                        break;
                    }
                    case R.id.settingMenu:{
                        startActivity(new Intent(AlbumActivity.this,SettingsActivity.class));
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
