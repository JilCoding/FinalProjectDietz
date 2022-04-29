
/**
 * Class that creates an assigner that can check if the artist is availible to take tasks, sorts
 * the artists by current tasks to evenly distribute the work load, and pairs it with a client
 * @author Jil Dietz
 * @version 1
 */
package main;

import java.util.ArrayList;
import main.Artist;

public class Assigner {
	//declaring the variables 
	final int MAX_TASKS = 5;
	ArrayList<Artist> artists; 
	//looping through the artists to verify they don't have max tasks
	public Assigner(ArrayList<Artist> artists) {
		this.artists = artists;
		this.artists.removeIf((artist) -> (artist.getCurrent() >= MAX_TASKS));
	}
	//sorting through the tasks to sort them from lowest tasks 
	public void selectionSort() {
		//creating the loop
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
		}
	}
	//pairing the artist to the client based on specialty and request to save to the 
	//linked list.
	public Artist getArtistFor(String request) {
		for(Artist i : artists) {
			if(request.equalsIgnoreCase(i.getSpecialty())) {
				return i;
			}
		}
		return null;
	}
}
