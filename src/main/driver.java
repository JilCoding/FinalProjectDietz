/**************************************************************
* Name        : Final Project
* Author      : Jil Dietz
* Created     : 04/12/2022
* Course      : CIS 152 Data Structures
* Version     : 1.0
* OS          : Windows 10
* Copyright   : This is my own original work based on
*               specifications issued by our instructor
* Description : This program takes an artist and a client then pairs them based on number of tasks
* 				and specialty based on the clients request.
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

	public static void main(String[] args) throws QueueEmptyException {
	
		//adding the artists to the arraylist
		ArrayList<Artist> artistList = Artist.setupArtists();
		//adding the clients to the client queue
		Queue clientList = Client.setupClient();
		//testing that the artists were added to the list
		System.out.println(artistList.toString());		
		//testing that the clients were added to the list
		System.out.println(clientList.printQueue()); 
		//ensuring the client list isn't empty
		System.out.println("Is clientList Empty? " + clientList.isEmpty());
		//testing the size method
		System.out.println(clientList.size());
		//assigning variables for the artist and the client to manipulate. Also testing peek()
		Client client1 = clientList.peek();
		Artist artist1 = artistList.get(0);
		//printing out the client/artist to ensure it's working properly with the variable
		System.out.println("Client 1: " + client1);
		System.out.println("Artist 1: " + artist1);
		//testing all the setters
		client1.setName("Jimmy Cricket");
		client1.setEmail("JCrick@email.com");
		client1.setRequest("Sketching");
		//running the output again to verify it updated
		System.out.println("Client 1: " + client1);
		System.out.println("Client 1 Name: " + client1.getName());
		System.out.println("Client 1 Email: " + client1.getEmail());
		System.out.println("Client 1 Request: " + client1.getRequest());
		//testing all the setters
		artist1.setName("Norina Beana");
		artist1.setEmail("NoriB@email.com");
		artist1.setSpeciality("Sketching");
		//testing all the getters
		System.out.println("Artist 1: " + artist1);
		System.out.println("Artist 1 Name: " + artist1.getName());
		System.out.println("Artist 1 Email: " + artist1.getEmail());
		System.out.println("Artist 1 Specialty: " + artist1.getSpecialty());
		//running a loop while the clientList isn't empty
		while(!clientList.isEmpty()) {
			//pulling each client off the list to compare it to an artist specialty, and add it to 
			//a new ArrayList to pair clients with artists
			Client current =  clientList.dequeue();
			Assigner artAssign = new Assigner(new ArrayList<Artist>(artistList));
			artAssign.selectionSort();
			Artist artist = artAssign.getArtistFor(current.getRequest());
			//if there is no artist available to pair with the client, a message is returned for which client cannot be helped
			if(artist == null) { 
				System.out.println("Not enough avalible artists for " +  current.getName() + "\n");
			//otherwise adds to the artist/client paired list
			}else {
				artist.addClient(current);
			}
		}
		//printing out the artistList after clients have been added
		System.out.println(artistList.toString());
		//ensuring the clientList is now empty and has been moved to to be paired with an artist.
		System.out.println("Is clientList Empty?: " + clientList.isEmpty());
		

	}

}
