/**************************************************************
* Name        : Final Project
* Author      : Jil Dietz
* Created     : 04/12/2022
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description :
* I have not used unauthorized source code, either modified or 
* unmodified. I have not given other fellow student(s) access to
* my program.         
***************************************************************/
package main;
import java.util.ArrayList;

import main.Artist;
import main.Client;
import main.Assigner;
import main.Queue;
import main.QueueEmptyException;
public class driver {
 //me adding a comment
	public static void main(String[] args) throws QueueEmptyException {
	
		//adding the artists to the arraylist
		ArrayList<Artist> artistList = Artist.setupArtists();
		//adding the clients to the client queue
		Queue clientList = Client.setupClient();
		//currentArtists.printQueue();
		//currentArtists.printQueue();
		System.out.println(artistList.toString());
		System.out.println(clientList.peek().toString());
		

		System.out.println(clientList.printQueue()); 
		
		
		while(!clientList.isEmpty()) {
			
			Client current =  clientList.dequeue();
			Assigner artAssign = new Assigner(new ArrayList<Artist>(artistList));
			artAssign.selectionSort();
			Artist artist = artAssign.getArtistFor(current.getRequest());
			if(artist == null) {
				System.out.println("Artist not found");
			}else {
				artist.addClient(current);
			}
		}
		System.out.println(artistList.toString());
	}

}
