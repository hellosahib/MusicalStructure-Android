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
import java.util.List;

public class ArtistActivity extends AppCompatActivity {

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
        getSupportActionBar().setTitle("Artist");

        ArrayList<SongsData> artistList = new ArrayList<>();
        artistList.add(new SongsData("",getString(R.string.artist1),"2016"));
        artistList.add(new SongsData("",getString(R.string.artist2),"2016"));
        artistList.add(new SongsData("",getString(R.string.artist3),"2016"));
        artistList.add(new SongsData("",getString(R.string.artist4),"2016"));

        SongsAdapter adapter = new SongsAdapter(this,artistList);
        listView.setAdapter(adapter);

        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.playingMenu:{
                        startActivity(new Intent(ArtistActivity.this,PlayingActivity.class));
                        break;
                    }
                    case R.id.settingMenu:{
                        startActivity(new Intent(ArtistActivity.this,SettingsActivity.class));
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
