package com.example.android.musicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SongAdapter  extends ArrayAdapter<Song> {

            SongAdapter(Context context, ArrayList<Song> song ){
            super ( context, 0, song );
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent){

            // Check if the existing view is being reused, otherwise inflate the view
            View listItemView = convertView;

            if(listItemView == null) {
                listItemView = LayoutInflater.from(getContext()).inflate(
                        R.layout.list_item, parent, false);
            }
            Song my_song = getItem(position);
            TextView songTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
            songTextView.setText(my_song.getSong());
            TextView artistalbumTextView = (TextView) listItemView.findViewById(R.id.artistalbum_text_view);
            artistalbumTextView.setText(my_song.getArtistAlbum ());

            return listItemView;


        }

}





