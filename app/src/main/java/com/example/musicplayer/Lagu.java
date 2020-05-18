package com.example.musicplayer;


import java.io.Serializable;

public class Lagu implements Serializable {
	private long id;
	private String title;
	private String artist;

	public Lagu(long songID, String songTitle, String songArtist) {
		id=songID;
		title=songTitle;
		artist=songArtist;
	}

	public long getID(){return id;}
	public String getTitle(){return title;}
	public String getArtist(){return artist;}
}