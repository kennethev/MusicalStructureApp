package com.example.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

    public class JazzActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate ( savedInstanceState );
            setContentView ( R.layout.song_list );

// Create an arraylist of words
            ArrayList<Song> songs = new ArrayList <Song> ();
            songs.add (new Song("When I Fall in Love","Chris Botti/ When I Fall in Love"));
            songs.add (new Song("The Look of Love", "Chris Botti/ A Thousand Kisses Deep"));
            songs.add (new Song("Make Someone Happy","Chris Botti/ When I Fall in Love ") );
            songs.add (new Song( "A Song for You","Chris Botti/ It's Time") );
            songs.add (new Song( "Maiden Voyage","Herbie Hancock/ Maiden Voyage") );
            songs.add (new Song( "Sleeping Giant","Herbie Hancock/ Crossings") );
            songs.add (new Song( "Chameleon","Herbie Hancock/ Headhunter") );

            SongAdapter adapter = new SongAdapter(this,songs);

            ListView listView = (ListView) findViewById(R.id.list);

            listView.setAdapter(adapter);

        }

}
