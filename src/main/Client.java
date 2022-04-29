
/**
 * Class that creates an client object and add it to the queue and print out the information
 * @author Jil Dietz
 * @version 1
 */

package main;

public class Client {
	//variables to store values
	private String name;
	private String email;
	private String request;
	//default constructor
	public Client() {
		
	}
	//constructor to take in values at initialization
	public Client(String name, String email, String request) {
		this.name = name;
		this.email = email;
		this.request = request;
		//p = priority;
	}
	//getters and setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getRequest() {
		return request;
	}
	//method to add all the clients to the queue 
	public static Queue setupClient(){
		Queue currentClients =  new Queue();
		currentClients.enqueue(new Client("Roberto Frances", "RobbieFran@email.com", "Paintings"));
		currentClients.enqueue(new Client("Risa Korgin", "RiKorg@email.com", "sketching"));
		currentClients.enqueue(new Client("Jennifer Riecs", "JRiCs@email.com", "Portraits"));
		currentClients.enqueue(new Client("Billy Bob", "Bobbers@email.com", "Portraits"));
		currentClients.enqueue(new Client("Mary Smith", "Mith2@email.com", "Portraits"));
		currentClients.enqueue(new Client("Peggy Hill", "Pill_Hill@email.com", "Portraits"));
		currentClients.enqueue(new Client("Kate Hudson", "KHudy09@email.com", "Portraits"));
		currentClients.enqueue(new Client("Nick Moore", "No_Moore@email.com", "Portraits"));
		currentClients.enqueue(new Client("Angela Frost", "AFrostIsComing@email.com", "Portraits"));
		currentClients.enqueue(new Client("Sakura Sakamoto", "SSmoto@email.com", "Paintings"));
		currentClients.enqueue(new Client("Ophelia Defrank", "Oph_F@email.com", "Paintings"));
		currentClients.enqueue(new Client("Picolo Picasso", "PPcolosso@email.com", "Paintings"));
		currentClients.enqueue(new Client("Freddy Krugler", "FredKrug@email.com", "Paintings"));
		currentClients.enqueue(new Client("Penelope Peasive", "PeaseStop@email.com", "Paintings"));
		currentClients.enqueue(new Client("Igor Adams", "IIgorU@email.com", "Paintings"));
		currentClients.enqueue(new Client("Serena Moon", "Moons_ser@email.com", "Paintings"));
		currentClients.enqueue(new Client("Brian Dogge", "BDawg@email.com", "skeTChing"));
		return currentClients;
	}
	//string method to print the information
	public String toString() {
		return "\n Name: " + name + " Email: " + email + " Request: " + request;
	}
}
