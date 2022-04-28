package main;

import java.util.ArrayList;
import main.Artist;

public class Assigner {

	final int MAX_TASKS = 5;
	ArrayList<Artist> artists; 
	
	public Assigner(ArrayList<Artist> artists) {
		this.artists = artists;
		this.artists.removeIf((artist) -> (artist.getCurrent() >= MAX_TASKS));
		//System.out.println("Assigner run");
	}
	public void selectionSort() {
		
		for(int i=0; i < artists.size() - 1;i++) 
		{
			int index = i;
			for (int j = i; j < artists.size(); j++) {
				if(artists.get(j).getCurrent() < artists.get(index).getCurrent()) 
				{
					index = j;
				}
			}
			Artist smallerNum = artists.get(index);
			artists.set(index, artists.get(i));
			artists.set(i, smallerNum);
			//System.out.println("Selection sort run");
		}
	}
	public Artist getArtistFor(String request) {
		//request = request.toLowerCase();
		for(Artist i : artists) {
			if(request.equalsIgnoreCase(i.getSpeciality())) {
				//System.out.println("Artist found " + i);
				return i;
			}
		}
		//System.out.println("getArtistFor returned null");
		return null;
	}
}
