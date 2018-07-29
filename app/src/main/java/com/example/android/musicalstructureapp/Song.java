package com.example.android.musicalstructureapp;

public class Song {
    //** Represents the song we want to find */

        //**Song titles */
        private String mSong;

        //**Album and artist of  title of song*/
        private String mArtistAlbum;

        public Song (String song, String artistAlbum){
            mSong = song;
            mArtistAlbum =artistAlbum;
        }
        /**Get album title of song*/
        public String getSong(){
            return mSong;
        }

        public String getArtistAlbum() {
            return mArtistAlbum;
        }
    }


