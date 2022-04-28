package main;

import java.util.ArrayList;
import java.util.LinkedList;
import main.Client;

public class Artist {
	private String name;
	private String email;
	private String speciality;
	private int currentTasks;
	LinkedList<Client> clients;
	
	public Artist() {
		
	}
	public Artist(String n, String e, String s, int ct) {
		name = n;
		email = e;
		speciality = s;
		currentTasks = ct;
		clients = new LinkedList<Client>();
	}
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
		this.speciality = speciality;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setCurrent(int currentTasks) {
		this.currentTasks = currentTasks;
	}
	public int getCurrent() {
		return currentTasks;
	}
	public void addClient(Client c) {
		clients.addLast(c);
		currentTasks = currentTasks++;
	}
	public static ArrayList<Artist> setupArtists() {
		ArrayList<Artist> artists = new ArrayList<>();
		artists.add(new Artist("Jenna Vance", "Jvance@email.com", "Paintings", 4));
		artists.add(new Artist("Bob Smith", "BbobS@email.com", "Portraits", 0));
		artists.add(new Artist("Renee Rino", "NayNayRi@email.com", "Sketching", 2));
		return artists;
	}
	public String toString() {
		String results = "Name: " + name + " Email: " + email + " Speciality: " + speciality + " Current Tasks: " + currentTasks;
		results += " Clients: ";
		
		for(Client client : clients) {
			results += " Client: " + client.getName();
		}
		return results;
	}
}
