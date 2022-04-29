
/**
 * Class that creates an artist object and add it to the arraylist and print out the information
 * @author Jil Dietz
 * @version 1
 */
package main;

import java.util.ArrayList;
import java.util.LinkedList;
import main.Client;

public class Artist {
	//declaring variables to hold the values
	private String name;
	private String email;
	private String specialty;
	//private int currentTasks;
	LinkedList<Client> clients;
	//default constructor
	public Artist() {
		
	}
	//constructor that takes in the values on initialization
	public Artist(String n, String e, String s) {
		name = n;
		email = e;
		specialty = s;
		//currentTasks = ct;
		clients = new LinkedList<Client>();
	}
	//setters and getters
	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public void setSpeciality(String speciality) {
		this.specialty = speciality;
	}
	public String getSpecialty() {
		return specialty;
	}
	public int getCurrent() {
		return clients.size();
	}
	//method to add the client to the to the linked list
	public void addClient(Client c) {
		clients.addLast(c);
	}
	//method to add all the artists to the arraylist
	public static ArrayList<Artist> setupArtists() {
		ArrayList<Artist> artists = new ArrayList<>();
		artists.add(new Artist("Jenna Vance", "Jvance@email.com", "Paintings"));
		artists.add(new Artist("Bob Smith", "BbobS@email.com", "Portraits"));
		artists.add(new Artist("Renee Rino", "NayNayRi@email.com", "Sketching"));
		artists.add(new Artist("Jonny Bravo", "YeaBaby@email.com", "Sketching"));
		artists.add(new Artist("Lisa Ledue", "LDue@email.com", "Paintings"));
		return artists;
	}
	//string method to print out to user
	public String toString() {
		String results = "\n Name: " + name + " Email: " + email + " Speciality: " + specialty + " Current Tasks: " + getCurrent();
		results += " Clients: " + "\n";
		
		for(Client client : clients) {
			results += " Client: " + client.getName() + "\n";
		}
		return results;
	}
}
