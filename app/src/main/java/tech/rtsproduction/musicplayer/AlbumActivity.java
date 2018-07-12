package tech.rtsproduction.musicplayer;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        listView = findViewById(R.id.listviewArtist);
        navigationView = findViewById(R.id.menuNavigationMusic);

        ArrayList<String> artistList = new ArrayList<>();
        artistList.add("Album 1");
        artistList.add("Album 2");
        artistList.add("Album 3");
        artistList.add("Album 4");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,artistList){
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view =super.getView(position, convertView, parent);
                TextView textView=view.findViewById(android.R.id.text1);
                textView.setTextColor(Color.WHITE);
                return view;
            }
        };

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
