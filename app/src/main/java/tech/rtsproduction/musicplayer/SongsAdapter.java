package tech.rtsproduction.musicplayer;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class SongsAdapter extends ArrayAdapter<SongsData> {

    public SongsAdapter(@NonNull Context context,@NonNull List<SongsData> objects) {

        super(context,0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View parentView = convertView;
        if(parentView==null){
            parentView = LayoutInflater.from(getContext()).inflate(R.layout.item_listview,parent,false);
        }
        //Getting Object at current location
        SongsData currentItem = getItem(position);
        //Initalizing and Setting of Text Items
        TextView songName = parentView.findViewById(R.id.listSongName);
        TextView artistName = parentView.findViewById(R.id.listArtistName);
        TextView dateName = parentView.findViewById(R.id.listDate);
        if(!currentItem.getName().isEmpty()){
            songName.setText(currentItem.getName());
        }
        artistName.setText(currentItem.getArtist());
        dateName.setText(currentItem.getDate());

        return parentView;
    }
}
