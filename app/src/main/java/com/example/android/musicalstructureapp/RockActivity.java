package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

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


        SongAdapter adapter = new SongAdapter ( this, songs );

        ListView listView = (ListView) findViewById ( R.id.list );

        listView.setAdapter ( adapter );

    }

    public static class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate ( savedInstanceState );
            setContentView ( R.layout.activity_main );

            //Find View that shows classic rock category
            TextView rock = (TextView) findViewById ( R.id.rock );

            //Set a click listener on the view
            rock.setOnClickListener ( new View.OnClickListener () {

                //The code in this method will be executed when song view is clicked on
                @Override
                public void onClick(View view) {

                    Intent rockIntent = new Intent ( MainActivity.this, RockActivity.class );
                    startActivity ( rockIntent );
                }
            } );

            //Find View that shows JAZZ category
            TextView jazz = (TextView) findViewById ( R.id.Jazz );

            //Set a click listener on the view
            jazz.setOnClickListener ( new View.OnClickListener () {

                //The code in this method will be executed when jazz view is clicked on
                @Override
                public void onClick(View view) {
                    Intent jazzIntent = new Intent ( MainActivity.this, JazzActivity.class );
                    startActivity ( jazzIntent );
                }
            });

        }
    }
}