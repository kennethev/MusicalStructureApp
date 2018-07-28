package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        ListView lv = (ListView) findViewById ( R.id.lv );

        //Find View that shows classic rock category
        TextView rock = (TextView) findViewById ( R.id.rock );

        //Set a click listener on the view
        rock.setOnClickListener ( new OnClickListener () {

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
        jazz.setOnClickListener ( new OnClickListener () {

            //The code in this method will be executed when jazz view is clicked on
            @Override
            public void onClick(View view) {
                Intent jazzIntent = new Intent ( MainActivity.this, JazzActivity.class );
                startActivity ( jazzIntent );
            }
        } );
        //Find View that shows Rhythm and Blues category
        TextView rhythm = (TextView) findViewById ( R.id.rhythm );

        //Set a click listener on the view
        rhythm.setOnClickListener ( new OnClickListener () {

            //The code in this method will be executed when rhythm view is clicked on
            @Override
            public void onClick(View view) {
                Intent rhythmIntent = new Intent ( MainActivity.this, RhythmActivity.class );
                startActivity ( rhythmIntent );
            }
        } );

        lv.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {

                Toast.makeText (getApplicationContext (),"Sorry forgot to add music. Come back later.",Toast.LENGTH_SHORT).show();
            }

        } );
    }
}