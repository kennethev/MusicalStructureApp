package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.song_list );

// Create an arraylist of words
        ArrayList <Song> songs = new ArrayList <Song> ();
        songs.add ( new Song ( "Crash", "Dave Matthews Crash" ) );
        songs.add ( new Song ( "Ants Marching", "Dave Matthews Remember Two Things" ) );
        songs.add ( new Song ( "Grey Street", "Dave Matthews Busted Stuff " ) );
        songs.add ( new Song ( "Satellite", "Dave Matthews Under the Table and Dreaming" ) );
        songs.add ( new Song ( "I am Mine", "Pearl Jam Riot Act" ) );
        songs.add ( new Song ( "Indifference", "Pearl Jam Vs." ) );
        songs.add ( new Song ( "Jeremy", "Pearl Jam Ten" ) );

        SongAdapter adapter = new SongAdapter ( this, songs );

        ListView listView = (ListView) findViewById ( R.id.list );

        listView.setAdapter ( adapter );

    }


        }

