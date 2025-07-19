package com.dkte;

public class Track {
	int track_id;
	String titLe;
	int album_id;
	int artist_id;
	
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public Track(int track_id, String titLe, int album_id, int artist_id) {
		
		this.track_id = track_id;
		this.titLe = titLe;
		this.album_id = album_id;
		this.artist_id = artist_id;
	}
	public int getTrack_id() {
		return track_id;
	}
	
	public String getTitLe() {
		return titLe;
	}
	
	public int getAlbum_id() {
		return album_id;
	}
	
	public int getArtist_id() {
		return artist_id;
	}
	

}
